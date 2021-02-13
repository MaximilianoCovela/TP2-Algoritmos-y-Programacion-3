package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testMuevePersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(0,-1);

        Posicion unaPosicionEsperada = new Posicion();

        unaPosicionEsperada.setPosicion(personaje.getPosicionActual().getValorHorizontal(),
                personaje.getPosicionActual().getValorVertical()-1);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

    }

    @Test
    public void testMuevePersonajeHaciaIzquierda(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(-1,0);

        Posicion unaPosicionEsperada = new Posicion();

        unaPosicionEsperada.setPosicion(personaje.getPosicionActual().getValorHorizontal()-1,
                personaje.getPosicionActual().getValorVertical());

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(0,1);

        Posicion unaPosicionEsperada = new Posicion();

        unaPosicionEsperada.setPosicion(personaje.getPosicionActual().getValorHorizontal(),
                personaje.getPosicionActual().getValorVertical()+1);

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));
    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(1,0);

        Posicion unaPosicionEsperada = new Posicion();

        unaPosicionEsperada.setPosicion(personaje.getPosicionActual().getValorHorizontal()+1,
                personaje.getPosicionActual().getValorVertical());

        personaje.actualizarPosicion(unaPosicion);

        assertTrue(personaje.enPosicion(unaPosicionEsperada));

}

    @Test
    public void testSeCreaSecuenciaDeBloquesYSeCompruebaQueElPersonajeSeMuevaCorrectamente() {
        Personaje unPersonaje = new Personaje();
        Posicion unaPosicion = new Posicion();
        unaPosicion.setPosicion(1,0);

        unPersonaje.actualizarPosicion(unaPosicion);

        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unPersonaje.getLapiz().modificarEstadoLapiz(unEstadoLapizAbajo);

        Posicion nuevaPosicion = new Posicion();
        nuevaPosicion.setPosicion(0, 1);

        unPersonaje.actualizarPosicion(nuevaPosicion);
        ArrayList<Figura> arregloSectorDibujo = unPersonaje.getLapiz().mostrarSectorDibujo().mostrarFiguras();

        Figura figura1 = arregloSectorDibujo.get(0);
        assertFalse(figura1.seHaDibujado());
        Figura figura2 = arregloSectorDibujo.get(1);
        assertTrue(figura2.seHaDibujado());
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

        Posicion posicionEsperada = new Posicion();
        posicionEsperada.setPosicion(unPersonaje.getPosicionActual().getValorHorizontal(),
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

        ArrayList<Figura> arregloSectorDibujo = unPersonaje.getLapiz().mostrarSectorDibujo().mostrarFiguras();
        Figura figura1 = arregloSectorDibujo.get(0);
        assertFalse(figura1.seHaDibujado());

        Figura figura2 = arregloSectorDibujo.get(1);
        assertFalse(figura2.seHaDibujado());

        Figura ultimaFigura = arregloSectorDibujo.get((arregloSectorDibujo.size())-1);
        assertTrue(ultimaFigura.seHaDibujado());
    }

}


