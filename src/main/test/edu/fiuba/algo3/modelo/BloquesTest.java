package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloquesTest {

    @Test
    public void testCreoUnBloqueAbajoYCreaUnMovimientoQueMueveAlPersonajeAbajo(){
        Bloque bloqueAbajo = new Bloque(new MovimientoAbajo());
        Personaje unPersonaje = new Personaje();

        bloqueAbajo.aplicarMovimiento(unPersonaje);

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(4, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueArribaYCreaUnMovimientoQueMueveAlPersonajeArriba(){
        Bloque bloqueArriba = new Bloque(new MovimientoArriba());
        Personaje unPersonaje = new Personaje();

        bloqueArriba.aplicarMovimiento(unPersonaje);

        assertEquals(5, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(6, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueDerechaYCreaUnMovimientoQueMueveAlPersonajeALaDerecha(){
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());
        Personaje unPersonaje = new Personaje();

        bloqueDerecha.aplicarMovimiento(unPersonaje);

        assertEquals(6, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testCreoUnBloqueIzquierdaYCreaUnMovimientoQueMueveAlPersonajeALaIzquierda(){
        Bloque bloqueIzquierda = new Bloque(new MovimientoIzquierda());
        Personaje unPersonaje = new Personaje();

        bloqueIzquierda.aplicarMovimiento(unPersonaje);

        assertEquals(4, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testAplicoUnBloqueConEstadoLapizAbajoYVerificoQueElLapizEsteAbajo(){
        Personaje unPersonaje = new Personaje();
        Bloque bloqueBajarLapiz = new Bloque(new LapizAbajo());
        bloqueBajarLapiz.modificarEstadoLapiz(unPersonaje);

        Lapiz unLapiz = unPersonaje.getLapiz();
        assertTrue(unLapiz.esPosibleDibujarCamino());
    }

    @Test
    public void testAplicoBloqueBajarLapizYLuegoBloqueSubirLapizYVerificoQueElLapizEsteArriba(){
        Personaje unPersonaje = new Personaje();
        Bloque bloqueBajarLapiz = new Bloque(new LapizAbajo());
        bloqueBajarLapiz.modificarEstadoLapiz(unPersonaje);
        Bloque bloqueSubirLapiz = new Bloque(new LapizArriba());
        bloqueSubirLapiz.modificarEstadoLapiz(unPersonaje);

        Lapiz unLapiz = unPersonaje.getLapiz();
        assertFalse(unLapiz.esPosibleDibujarCamino());
    }

}
