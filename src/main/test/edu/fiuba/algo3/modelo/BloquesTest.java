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

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()-1);

        bloqueAbajo.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueArribaYCreaUnMovimientoQueMueveAlPersonajeArriba(){
        Bloque bloqueArriba = new Bloque(new MovimientoArriba());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+1);

        bloqueArriba.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueDerechaYCreaUnMovimientoQueMueveAlPersonajeALaDerecha(){
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion();

        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal()+1,
                unPersonaje.getPosicionActual().getValorVertical());

        bloqueDerecha.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnBloqueIzquierdaYCreaUnMovimientoQueMueveAlPersonajeALaIzquierda(){
        Bloque bloqueIzquierda = new Bloque(new MovimientoIzquierda());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal()-1,
                unPersonaje.getPosicionActual().getValorVertical());

        bloqueIzquierda.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testAplicoUnBloqueConEstadoLapizAbajoYVerificoQueElLapizEsteAbajo(){
        Personaje unPersonaje = new Personaje();
        Bloque bloqueBajarLapiz = new Bloque(new MovimientoLapizAbajo());
        bloqueBajarLapiz.aplicarMovimiento(unPersonaje);

        Lapiz unLapiz = unPersonaje.getLapiz();
        assertTrue(unLapiz.esPosibleDibujarCamino());

    }

    @Test
    public void testAplicoBloqueBajarLapizYLuegoBloqueSubirLapizYVerificoQueElLapizEsteArriba(){
        Personaje unPersonaje = new Personaje();
        Bloque bloqueBajarLapiz = new Bloque(new MovimientoLapizAbajo());
        bloqueBajarLapiz.aplicarMovimiento(unPersonaje);
        Bloque bloqueSubirLapiz = new Bloque(new MovimientoLapizArriba());
        bloqueSubirLapiz.aplicarMovimiento(unPersonaje);

        Lapiz unLapiz = unPersonaje.getLapiz();
        assertFalse(unLapiz.esPosibleDibujarCamino());

    }

    @Test
    public void testCreoUnBloqueRepetirDosVecesYRepiteLaSecuenciaDosVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+2);

        Bloque bloqueRepetir = new Bloque( unMovimientoRepetir);

        bloqueRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueRepetirTresVecesYRepiteLaSecuenciaTresVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(3);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+3);

        Bloque bloqueRepetir = new Bloque( unMovimientoRepetir);

        bloqueRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

}
