package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientosTest {

    @Test
    public void testCreoUnMovimientoAbajoYMueveAlPersonajeAbajo(){

        Movimiento movimientoAbajo = new MovimientoAbajo();
        Personaje unPersonaje = new Personaje();

        movimientoAbajo.aplicarMovimiento(unPersonaje);
        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(4, (unPersonaje.getPosicionActual().getValorVertical()));

    }


    @Test
    public void testCreoUnMovimientoArribaYMueveAlPersonajeArriba(){

        Movimiento movimientoArriba = new MovimientoArriba();
        Personaje unPersonaje = new Personaje();

        movimientoArriba.aplicarMovimiento(unPersonaje);
        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(6, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnMovimientoDerechaYMueveAlPersonajeALaDerecha(){
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Personaje unPersonaje = new Personaje();

        movimientoDerecha.aplicarMovimiento(unPersonaje);
        assertEquals(6, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnMovimientoIzquierdaYMueveAlPersonajeALaIzquierda(){
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Personaje unPersonaje = new Personaje();

        movimientoIzquierda.aplicarMovimiento(unPersonaje);
        assertEquals(4, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }


}
