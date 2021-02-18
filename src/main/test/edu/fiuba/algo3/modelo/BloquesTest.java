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

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()-1);

        bloqueAbajo.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueArribaYCreaUnMovimientoQueMueveAlPersonajeArriba(){
        Bloque bloqueArriba = new Bloque(new MovimientoArriba());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+1);

        bloqueArriba.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueDerechaYCreaUnMovimientoQueMueveAlPersonajeALaDerecha(){
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal()+1,
                unPersonaje.getPosicionActual().getValorVertical());

        bloqueDerecha.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnBloqueIzquierdaYCreaUnMovimientoQueMueveAlPersonajeALaIzquierda(){
        Bloque bloqueIzquierda = new Bloque(new MovimientoIzquierda());
        Personaje unPersonaje = new Personaje();

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal()-1,
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
    public void testCreoUnBloqueDeRepetirDosVecesYRepiteLaSecuenciaDosVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+2);

        Bloque bloqueRepetir = new Bloque( unMovimientoRepetir);

        bloqueRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueDeRepetirTresVecesYRepiteLaSecuenciaTresVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(3);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+3);

        Bloque bloqueRepetir = new Bloque( unMovimientoRepetir);

        bloqueRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }
        //desde aca hay tests nuevos

    @Test
    public void testCreoBloqueInvertirEInviertoVariosBloquesSimples(){
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoInvertir.agregarMovimiento(movimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoDerecha);
        unMovimientoInvertir.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()-1);

        Bloque bloqueInvertir = new Bloque(unMovimientoInvertir);
        bloqueInvertir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueInvertirYLoVuelvoAInvertir(){
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        MovimientoInvertir otroMovimientoInvertir = new MovimientoInvertir();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento otroMovimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoInvertir.agregarMovimiento(movimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoDerecha);
        unMovimientoInvertir.agregarMovimiento(otroMovimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoArriba);

        otroMovimientoInvertir.agregarMovimiento(unMovimientoInvertir);
        Posicion posicionEsperada =  new Posicion(
                unPersonaje.getPosicionActual().getValorHorizontal()-1,
                unPersonaje.getPosicionActual().getValorVertical()+1);

        Bloque bloqueInvertir = new Bloque(otroMovimientoInvertir);
        bloqueInvertir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnBloqueRepetirConUnInvertirAdentro(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento otroMovimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoInvertir.agregarMovimiento(movimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoDerecha);
        unMovimientoInvertir.agregarMovimiento(otroMovimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.agregarMovimiento(unMovimientoInvertir);
        Posicion posicionEsperada =  new Posicion(
                unPersonaje.getPosicionActual().getValorHorizontal()+2,
                unPersonaje.getPosicionActual().getValorVertical()-2);

        Bloque bloqueRepetir = new Bloque(unMovimientoRepetir);
        bloqueRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoBloqueInvertirEInviertoBloqueLapizAbajo(){
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoLapizAbajo = new MovimientoLapizAbajo();

        unMovimientoInvertir.agregarMovimiento(movimientoLapizAbajo);

        Bloque bloqueInvertir = new Bloque(unMovimientoInvertir);
        bloqueInvertir.aplicarMovimiento(unPersonaje);

        assertFalse((unPersonaje.getLapiz()).esPosibleDibujarCamino());

    }

    @Test
    public void testCreoBloqueInvertirEInviertoBloqueLapizArriba(){
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoLapizArriba = new MovimientoLapizArriba();

        unMovimientoInvertir.agregarMovimiento(movimientoLapizArriba);

        Bloque bloqueInvertir = new Bloque(unMovimientoInvertir);
        bloqueInvertir.aplicarMovimiento(unPersonaje);

        assertTrue((unPersonaje.getLapiz()).esPosibleDibujarCamino());

    }


    @Test
    public void testCreoBloquePersonalizadoConMovimientosSimples(){
        MovimientoPersonalizado unMovimientoPersonalizado = new MovimientoPersonalizado();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento otroMovimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoPersonalizado.agregarMovimiento(movimientoIzquierda);
        unMovimientoPersonalizado.agregarMovimiento(movimientoDerecha);
        unMovimientoPersonalizado.agregarMovimiento(otroMovimientoIzquierda);
        unMovimientoPersonalizado.agregarMovimiento(movimientoArriba);

        Posicion posicionEsperada =  new Posicion(
                unPersonaje.getPosicionActual().getValorHorizontal()-1,
                unPersonaje.getPosicionActual().getValorVertical()+1);

        Bloque bloquePersonalizado = new Bloque(unMovimientoPersonalizado);
        bloquePersonalizado.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoBloquePersonalizadoConMovimientosSimplesYAvanzados(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        MovimientoPersonalizado unMovimientoPersonalizado = new MovimientoPersonalizado();
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento otroMovimientoIzquierda = new MovimientoIzquierda();
        Movimiento otroMovimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        unMovimientoInvertir.agregarMovimiento(movimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoDerecha);
        unMovimientoInvertir.agregarMovimiento(otroMovimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.agregarMovimiento(unMovimientoInvertir);

        unMovimientoPersonalizado.agregarMovimiento(otroMovimientoDerecha);
        unMovimientoPersonalizado.agregarMovimiento(otroMovimientoArriba);
        unMovimientoPersonalizado.agregarMovimiento(unMovimientoRepetir);

        Posicion posicionEsperada =  new Posicion(
                unPersonaje.getPosicionActual().getValorHorizontal()+3,
                unPersonaje.getPosicionActual().getValorVertical()-1);

        Bloque bloquePersonalizado = new Bloque(unMovimientoPersonalizado);
        bloquePersonalizado.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }



}
