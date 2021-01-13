package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MovimientosTest {

    @Test
    public void testCreoUnMovimientoAbajoYMueveAlPersonajeAbajo(){
        Movimiento movimientoAbajo = new MovimientoAbajo();
        Personaje unPersonaje = new Personaje();



    }
    /*
    @Test
    public void testCreoUnMovimientoArribaYMueveAlPersonajeArriba(){
        Movimiento movimientoArriba = new MovimientoArriba();
        Personaje unPersonaje = new Personaje();

        movimientoArriba.modificarAPosicionSiguiente(unPersonaje.getPosicionActual());
        Posicion unaPosicion = new Posicion();
        unaPosicion.setPosicion(5, 6);

        assertTrue(unPersonaje.enPosicion(unaPosicion));

    }

    @Test
    public void testCreoUnMovimientoDerechaYMueveAlPersonajeALaDerecha(){
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Personaje unPersonaje = new Personaje();

        movimientoDerecha.modificarAPosicionSiguiente(unPersonaje.getPosicionActual());
        Posicion unaPosicion = new Posicion();
        unaPosicion.setPosicion(6, 5);

        assertTrue(unPersonaje.enPosicion(unaPosicion));

    }

    @Test
    public void testCreoUnMovimientoIzquierdaYMueveAlPersonajeALaIzquierda(){
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Personaje unPersonaje = new Personaje();

        movimientoIzquierda.modificarAPosicionSiguiente(unPersonaje.getPosicionActual());
        Posicion unaPosicion = new Posicion();
        unaPosicion.setPosicion(4, 5);

        assertTrue(unPersonaje.enPosicion(unaPosicion));

    }

     */
}
