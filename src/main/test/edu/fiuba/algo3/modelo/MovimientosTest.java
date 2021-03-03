package edu.fiuba.algo3.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovimientosTest {

    @Test
    public void testCreoUnMovimientoAbajoYMueveAlPersonajeAbajo(){

        Movimiento movimientoAbajo = new MovimientoAbajo();
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Posicion posicionEsperada = new Posicion(4, 5);

        movimientoAbajo.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }


    @Test
    public void testCreoUnMovimientoArribaYMueveAlPersonajeArriba(){

        Movimiento movimientoArriba = new MovimientoArriba();
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);

        Posicion posicionEsperada = new Posicion(4, 3);

        movimientoArriba.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnMovimientoDerechaYMueveAlPersonajeALaDerecha(){
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);

        Posicion posicionEsperada = new Posicion(6, 5);

        movimientoDerecha.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnMovimientoIzquierdaYMueveAlPersonajeALaIzquierda(){
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Posicion posicionEsperada = new Posicion(4, 5);

        movimientoIzquierda.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));
    }

    @Test
    public void testCreoUnMovimientoRepetirDosVecesYRepiteLaSecuenciaDosVeces(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion(4, 2);

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnMovimientoPersonalizadoConMovimientosSimplesYSeMueveCorrectamenteElPersonaje(){
        MovimientoPersonalizado unMovimientoPersonalizado = new MovimientoPersonalizado();
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoArriba1 = new MovimientoArriba();
        Movimiento movimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion(3, 2);

        unMovimientoPersonalizado.agregarMovimiento(movimientoIzquierda);
        unMovimientoPersonalizado.agregarMovimiento(movimientoArriba1);
        unMovimientoPersonalizado.agregarMovimiento(movimientoArriba);

        unMovimientoPersonalizado.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

    @Test
    public void testCreoUnMovimientoPersonalizadoConMovimientosSimplesYAvanzadosYSeMueveCorrectamenteElPersonaje(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        MovimientoInvertir unMovimientoInvertir = new MovimientoInvertir();
        MovimientoPersonalizado unMovimientoPersonalizado = new MovimientoPersonalizado();
        Posicion posicionInicial = new Posicion(4, 4);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento otroMovimientoIzquierda = new MovimientoIzquierda();
        Movimiento otroMovimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        Posicion posicionEsperada = new Posicion(7, 5);

        unMovimientoInvertir.agregarMovimiento(movimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoDerecha);
        unMovimientoInvertir.agregarMovimiento(otroMovimientoIzquierda);
        unMovimientoInvertir.agregarMovimiento(movimientoArriba);

        unMovimientoRepetir.agregarMovimiento(unMovimientoInvertir);

        unMovimientoPersonalizado.agregarMovimiento(otroMovimientoDerecha);
        unMovimientoPersonalizado.agregarMovimiento(otroMovimientoArriba);
        unMovimientoPersonalizado.agregarMovimiento(unMovimientoRepetir);

        unMovimientoPersonalizado.aplicarMovimiento(unPersonaje);

        assertTrue(unPersonaje.enPosicion(posicionEsperada));

    }

}