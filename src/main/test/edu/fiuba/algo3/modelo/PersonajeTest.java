package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testMuevePersonajeHaciaAbajo(){
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje personaje = new Personaje(posicionInicial);
        Posicion unaPosicion = new Posicion(0,-1);

        Posicion unaPosicionEsperada = new Posicion(5, 4);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

    }

    @Test
    public void testMuevePersonajeHaciaIzquierda(){
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje personaje = new Personaje(posicionInicial);
        Posicion unaPosicion = new Posicion(-1,0);

        Posicion unaPosicionEsperada = new Posicion(4, 5);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje personaje = new Personaje(posicionInicial);
        Posicion unaPosicion = new Posicion(0,1);

        Posicion unaPosicionEsperada = new Posicion(5, 6);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje personaje = new Personaje(posicionInicial);
        Posicion unaPosicion = new Posicion(1,0);

        Posicion unaPosicionEsperada = new Posicion(6, 5);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

}

    @Test
    public void testSeMuevePersonajeConLapizArribaYLapizAbajoYSeCompruebaQueLosDibujosSeHayanCreadoCorrectamente() {
        Personaje unPersonaje = new Personaje();
        Posicion unaPosicion = new Posicion(1,0);

        unPersonaje.actualizarPosicion(unaPosicion);

        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unPersonaje.getLapiz().modificarEstadoLapiz(unEstadoLapizAbajo);

        Posicion nuevaPosicion = new Posicion(0,1);

        unPersonaje.actualizarPosicion(nuevaPosicion);
        ArrayList<Dibujo> arregloDibujos = unPersonaje.obtenerDibujos();

        Dibujo dibujo1 = arregloDibujos.get(0);
        assertFalse(dibujo1.mostrarDibujo());
        Dibujo dibujo2 = arregloDibujos.get(1);
        assertTrue(dibujo2.mostrarDibujo());
    }

    @Test
    public void testSeMuevePersonajeConMovimientosDeRepeticionYSeChequeaQueSeMuevaCorrectamente(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento movimientoLapizAbajo = new MovimientoLapizAbajo();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion(4, 1);

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.aplicarMovimiento(unPersonaje);
        movimientoLapizAbajo.aplicarMovimiento(unPersonaje);
        otroMovimientoArriba.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testSeMuevePersonajeYSeBajaLapizYSeChequeaQueCambieElEstadoDelLapizCorrectamente(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento movimientoLapizAbajo = new MovimientoLapizAbajo();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.aplicarMovimiento(unPersonaje);
        movimientoLapizAbajo.aplicarMovimiento(unPersonaje);
        otroMovimientoArriba.aplicarMovimiento(unPersonaje);

        ArrayList<Dibujo> arregloDibujos = unPersonaje.obtenerDibujos();
        Dibujo dibujo1 = arregloDibujos.get(0);
        assertFalse(dibujo1.mostrarDibujo());

        Dibujo dibujo2 = arregloDibujos.get(1);
        assertFalse(dibujo2.mostrarDibujo());

        Dibujo ultimoDibujo = arregloDibujos.get((arregloDibujos.size())-1);
        assertTrue(ultimoDibujo.mostrarDibujo());
    }

}


