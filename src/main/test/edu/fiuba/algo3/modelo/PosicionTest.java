package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PosicionTest{

    @Test
    public void testModificaLaPosicionHaciaLaDerechaYSeActualizaCorrectamente(){
        Posicion posicion = new Posicion();

        Posicion posicionADerecha= new Posicion(1,0);

        Posicion posicionEsperada = new Posicion(posicion.getValorHorizontal()+1, posicion.getValorVertical());

        posicion.actualizarPosicion(posicionADerecha);

        assertTrue(posicion.esIgualA(posicionEsperada));

    }

    @Test
    public void testModificaLaPosicionHaciaLaIzquierdaYSeActualizaCorrectamente(){

        Posicion posicion = new Posicion();

        Posicion posicionAIzquierda = new Posicion(-1,0);

        Posicion posicionEsperada = new Posicion(posicion.getValorHorizontal() - 1, posicion.getValorVertical());

        posicion.actualizarPosicion(posicionAIzquierda);

        assertTrue(posicion.esIgualA(posicionEsperada));

    }

    @Test
    public void testModificaLaPosicionHaciaArribaYSeActualizaCorrectamente(){

        Posicion posicion = new Posicion();

        Posicion posicionAArriba = new Posicion(0,1);

        Posicion posicionEsperada = new Posicion(posicion.getValorHorizontal(), posicion.getValorVertical() + 1);

        posicion.actualizarPosicion(posicionAArriba);

        assertTrue(posicion.esIgualA(posicionEsperada));

    }

    @Test
    public void testModificaLaPosicionHaciaAbajoYSeActualizaCorrectamente(){

        Posicion posicion = new Posicion();

        Posicion posicionAAbajo = new Posicion(0,-1);

        Posicion posicionEsperada = new Posicion(posicion.getValorHorizontal(), posicion.getValorVertical() - 1);

        posicion.actualizarPosicion(posicionAAbajo);

        assertTrue(posicion.esIgualA(posicionEsperada));

    }

    @Test
    public void testModificaLaPosicionEnDiferentesDireccionesYSeActualizaCorrectamente(){

        Posicion posicion = new Posicion();

        Posicion posicionAArriba = new Posicion(0,1);

        Posicion posicionEsperada = new Posicion(posicion.getValorHorizontal(), posicion.getValorVertical() + 1);

        posicion.actualizarPosicion(posicionAArriba);

        assertTrue(posicion.esIgualA(posicionEsperada));


        Posicion posicionADerecha = new Posicion(1,0);

        Posicion otraPosicionEsperada = new Posicion(posicion.getValorHorizontal() + 1, posicion.getValorVertical());

        posicion.actualizarPosicion(posicionADerecha);

        assertTrue(posicion.esIgualA(otraPosicionEsperada));

    }
}
