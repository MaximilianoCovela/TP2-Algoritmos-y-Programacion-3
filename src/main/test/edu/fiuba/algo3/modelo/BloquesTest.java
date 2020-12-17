package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloquesTest {

    @Test
    public void testCreoUnBloqueAbajoYCreaUnMovimientoQueMueveAlPersonajeAbajo(){
        BloqueMovible bloqueAbajo = new BloqueAbajo();
        Personaje unPersonaje = new Personaje();

        bloqueAbajo.aplicarMovimiento(unPersonaje);

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(4, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueArribaYCreaUnMovimientoQueMueveAlPersonajeArriba(){
        BloqueMovible bloqueArriba = new BloqueArriba();
        Personaje unPersonaje = new Personaje();

        bloqueArriba.aplicarMovimiento(unPersonaje);

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(6, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueDerechaYCreaUnMovimientoQueMueveAlPersonajeALaDerecha(){
        BloqueMovible bloqueDerecha = new BloqueDerecha();
        Personaje unPersonaje = new Personaje();

        bloqueDerecha.aplicarMovimiento(unPersonaje);

        assertEquals(6, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueIzquierdaYCreaUnMovimientoQueMueveAlPersonajeALaIzquierda(){
        BloqueMovible bloqueIzquierda = new BloqueIzquierda();
        Personaje unPersonaje = new Personaje();

        bloqueIzquierda.aplicarMovimiento(unPersonaje);

        assertEquals(4, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

}
