package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTest{

    @Test
    public void testCreaPosicionYChequeoQueSeCreeEnLaPosicionInicialEsperada(){
        Posicion posicion = new Posicion();

        assertEquals(5, (posicion.getValorHorizontal()));

        assertEquals(5, (posicion.getValorVertical()));

    }


    @Test
    public void testModificaLaPosicionYSeActualizaCorrectamente(){
        Posicion posicion = new Posicion();

        Posicion posicionAArriba = new Posicion();
        posicionAArriba.setPosicion(0,1);

        Posicion posicionADerecha= new Posicion();
        posicionADerecha.setPosicion(1,0);

        posicion.actualizarPosicion(posicionADerecha);

        assertEquals(6, (posicion.getValorHorizontal()));

        assertEquals(5, (posicion.getValorVertical()));

        posicion.actualizarPosicion(posicionAArriba);

        assertEquals(6, (posicion.getValorHorizontal()));

        assertEquals(6, (posicion.getValorVertical()));

    }


}
