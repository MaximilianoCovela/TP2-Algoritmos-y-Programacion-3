package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosicionTest{

    @Test
    public void testModificaLaPosicionYSeActualizaCorrectamente(){
        Posicion posicion = new Posicion();
        Posicion posicionEsperada = new Posicion();

        Posicion posicionADerecha= new Posicion();
        posicionADerecha.setPosicion(1,0);

        posicionEsperada.setPosicion(posicion.getValorHorizontal()+1, posicion.getValorVertical());

        posicion.actualizarPosicion(posicionADerecha);

        assertTrue(posicion.esIgualA(posicionEsperada));

        Posicion posicionAArriba = new Posicion();
        posicionAArriba.setPosicion(0,1);

        posicionEsperada.setPosicion(posicion.getValorHorizontal(), posicion.getValorVertical()+1);

        posicion.actualizarPosicion(posicionAArriba);

        assertTrue(posicion.esIgualA(posicionEsperada));

    }


}
