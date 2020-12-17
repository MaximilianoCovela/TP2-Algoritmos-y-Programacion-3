package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientosTest {

    @Test
    public void testCreoUnMovimientoAbajoYMueveAlPersonajeAbajo(){
        Movimiento movimientoAbajo = new MovimientoAbajo();
        Personaje unPersonaje = new Personaje();

        movimientoAbajo.calcularPosicionSiguiente(unPersonaje.getPosicionActual());

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(4, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnMovimientoArribaYMueveAlPersonajeArriba(){
        Movimiento movimientoArriba = new MovimientoArriba();
        Personaje unPersonaje = new Personaje();

        movimientoArriba.calcularPosicionSiguiente(unPersonaje.getPosicionActual());

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(6, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnMovimientoDerechaYMueveAlPersonajeALaDerecha(){
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Personaje unPersonaje = new Personaje();

        movimientoDerecha.calcularPosicionSiguiente(unPersonaje.getPosicionActual());

        assertEquals(6, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnMovimientoIzquierdaYMueveAlPersonajeALaIzquierda(){
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Personaje unPersonaje = new Personaje();

        movimientoIzquierda.calcularPosicionSiguiente(unPersonaje.getPosicionActual());

        assertEquals(4, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }
}
