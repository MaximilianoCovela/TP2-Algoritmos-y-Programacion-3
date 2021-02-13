package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientosTest {

    @Test
    public void testCreoUnMovimientoAbajoYMueveAlPersonajeAbajo(){

        Movimiento movimientoAbajo = new MovimientoAbajo();
        Personaje unPersonaje = new Personaje();
        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()-1);

        movimientoAbajo.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }


    @Test
    public void testCreoUnMovimientoArribaYMueveAlPersonajeArriba(){

        Movimiento movimientoArriba = new MovimientoArriba();
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+1);

        movimientoArriba.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnMovimientoDerechaYMueveAlPersonajeALaDerecha(){
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Personaje unPersonaje = new Personaje();
        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal()+1,
                unPersonaje.getPosicionActual().getValorVertical());

        movimientoDerecha.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnMovimientoIzquierdaYMueveAlPersonajeALaIzquierda(){
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Personaje unPersonaje = new Personaje();
        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal()-1,
                unPersonaje.getPosicionActual().getValorVertical());

        movimientoIzquierda.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnMovimientoRepetirDosVecesYRepiteLaSecuenciaDosVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+2);

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }


}
