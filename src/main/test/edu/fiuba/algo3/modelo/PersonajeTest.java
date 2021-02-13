package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testMuevePersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion(0,-1);

        Posicion unaPosicionEsperada = new Posicion(personaje.getPosicionActual().getValorHorizontal(),
                personaje.getPosicionActual().getValorVertical()-1);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

    }

    @Test
    public void testMuevePersonajeHaciaIzquierda(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion(-1,0);

        Posicion unaPosicionEsperada = new Posicion(personaje.getPosicionActual().getValorHorizontal()-1,
                personaje.getPosicionActual().getValorVertical());

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion(0,1);

        Posicion unaPosicionEsperada = new Posicion(personaje.getPosicionActual().getValorHorizontal(),
                personaje.getPosicionActual().getValorVertical()+1);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion(1,0);

        Posicion unaPosicionEsperada = new Posicion(personaje.getPosicionActual().getValorHorizontal()+1,
                personaje.getPosicionActual().getValorVertical());

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

}

    @Test
    public void testSeCreaSecuenciaDeBloquesYSeCompruebaQueElPersonajeSeMuevaCorrectamente() {
        Personaje unPersonaje = new Personaje();
        Posicion unaPosicion = new Posicion(1,0);

        unPersonaje.actualizarPosicion(unaPosicion);

        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unPersonaje.getLapiz().modificarEstadoLapiz(unEstadoLapizAbajo);

        Posicion nuevaPosicion = new Posicion(0,1);

        unPersonaje.actualizarPosicion(nuevaPosicion);
        ArrayList<Dibujo> arregloSectorDibujo = unPersonaje.getLapiz().mostrarSectorDibujo().mostrarDibujos();

        Dibujo dibujo1 = arregloSectorDibujo.get(0);
        assertFalse(dibujo1.mostrarDibujo());
        Dibujo dibujo2 = arregloSectorDibujo.get(1);
        assertTrue(dibujo2.mostrarDibujo());
    }

    @Test
    public void testSeMuevePersonajeConMovimientosDeRepeticionYSeChequeaQueSeMuevaCorrectamente(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Personaje unPersonaje = new Personaje();
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento movimientoLapizAbajo = new MovimientoLapizAbajo();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion(unPersonaje.getPosicionActual().getValorHorizontal(),
                unPersonaje.getPosicionActual().getValorVertical()+3);

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

        ArrayList<Dibujo> arregloSectorDibujo = unPersonaje.getLapiz().mostrarSectorDibujo().mostrarDibujos();
        Dibujo dibujo1 = arregloSectorDibujo.get(0);
        assertFalse(dibujo1.mostrarDibujo());

        Dibujo dibujo2 = arregloSectorDibujo.get(1);
        assertFalse(dibujo2.mostrarDibujo());

        Dibujo ultimoDibujo = arregloSectorDibujo.get((arregloSectorDibujo.size())-1);
        assertTrue(ultimoDibujo.mostrarDibujo());
    }

}


