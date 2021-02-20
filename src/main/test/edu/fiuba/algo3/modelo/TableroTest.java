package edu.fiuba.algo3.modelo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAgregarBloqueDerecha(){
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());
        Tablero tablero = new Tablero();
        tablero.agregarBloque(bloqueDerecha);

    }

    @Test
    public void testAgregoBloqueDerechaEIntentoQuitarBloqueInexistente(){
        Bloque bloqueIzquierda = new Bloque(new MovimientoIzquierda());
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(bloqueDerecha);

        expectedException.expect(BloqueNoEncontradoException.class);

        tablero.quitarBloque(bloqueIzquierda);
    }

    @Test
    public void testAgregoBloqueDerechaYReinicioTableroYNoTengoBloquesEnElTablero(){
        Bloque bloqueDerecha = new Bloque(new MovimientoDerecha());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(bloqueDerecha);

        tablero.reiniciarTablero();

        expectedException.expect(BloqueNoEncontradoException.class);

        tablero.quitarBloque(bloqueDerecha);

    }

    @Test
    public void testAgregoBloqueAIzquierdaEjecutoLaSecuenciaYElPersonajeSeMueveAIzquierda(){
        Bloque unBloqueAIzquierda = new Bloque(new MovimientoIzquierda());
        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero tablero = new Tablero(unPersonaje);

        tablero.agregarBloque(unBloqueAIzquierda);

        Posicion posicionEsperada = new Posicion(4, 5);

        tablero.ejecutarSecuencia();

        assertTrue(tablero.getPersonaje().enPosicion(posicionEsperada));
    }

    @Test
    public void testAgregoBloqueADerechaEjecutoLaSecuenciaYElPersonajeSeMueveADerecha(){
        Bloque unBloqueADerecha = new Bloque(new MovimientoDerecha());

        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero tablero = new Tablero(unPersonaje);

        tablero.agregarBloque(unBloqueADerecha);

        Posicion posicionEsperada = new Posicion(6, 5);

        tablero.ejecutarSecuencia();

        assertTrue(tablero.getPersonaje().enPosicion(posicionEsperada));
    }

    @Test
    public void testAgregoBloqueAArribaEjecutoLaSecuenciaYElPersonajeSeMueveAArriba(){
        Bloque unBloqueAArriba = new Bloque(new MovimientoArriba());

        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero tablero = new Tablero(unPersonaje);

        tablero.agregarBloque(unBloqueAArriba);

        Posicion posicionEsperada = new Posicion(5, 6);

        tablero.ejecutarSecuencia();

        assertTrue(tablero.getPersonaje().enPosicion(posicionEsperada));
    }

    @Test
    public void testAgregoBloqueAAbajoEjecutoLaSecuenciaYElPersonajeSeMueveAAbajo(){
        Bloque unBloqueAAbajo = new Bloque(new MovimientoAbajo());

        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero tablero = new Tablero(unPersonaje);

        tablero.agregarBloque(unBloqueAAbajo);

        Posicion posicionEsperada = new Posicion(5, 4);

        tablero.ejecutarSecuencia();

        assertTrue(tablero.getPersonaje().enPosicion(posicionEsperada));
    }

    @Test
    public void testAgregoBloquesEjecutoLaSecuenciaYSeModificaLaPosicionDelPersonaje(){

        Bloque unBloqueADerecha = new Bloque(new MovimientoDerecha());
        Bloque unBloqueAIzquierda = new Bloque(new MovimientoIzquierda());
        Bloque unBloqueAAbajo = new Bloque(new MovimientoAbajo());
        Bloque otroBloqueAAbajo = new Bloque(new MovimientoAbajo());
        Bloque unBloqueAArriba = new Bloque(new MovimientoArriba());

        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero tablero = new Tablero(unPersonaje);

        tablero.agregarBloque(unBloqueADerecha);
        tablero.agregarBloque(unBloqueAIzquierda);
        tablero.agregarBloque(unBloqueAAbajo);
        tablero.agregarBloque(otroBloqueAAbajo);
        tablero.agregarBloque(unBloqueAArriba);

        Posicion posicionEsperada = new Posicion(5, 4);

        tablero.ejecutarSecuencia();

        assertTrue(tablero.getPersonaje().enPosicion(posicionEsperada));
    }

    @Test
    public void testSeCreaBloqueRepetirYSeVerificaLaPosicionDelPersonaje(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Posicion posicionInicial = new Posicion(5, 5);
        Personaje unPersonaje = new Personaje(posicionInicial);
        Tablero unTablero = new Tablero(unPersonaje);

        Bloque unBloqueRepetir = new Bloque(unMovimientoRepetir);

        unTablero.agregarBloque(unBloqueRepetir);

        Posicion posicionEsperada = new Posicion(5, 7);

        unTablero.ejecutarSecuencia();

        assertTrue(unTablero.getPersonaje().enPosicion(posicionEsperada));

    }

    @Test
    public void testSeCreanBloquesYSeVerificaElEstadoLapiz(){
        MovimientoRepetir unMovimientoRepetir = new MovimientoRepetir(2);
        Movimiento movimientoIzquierda = new MovimientoIzquierda();
        Movimiento movimientoDerecha = new MovimientoDerecha();
        Movimiento movimientoArriba = new MovimientoArriba();
        Movimiento movimientoLapizAbajo = new MovimientoLapizAbajo();
        Movimiento otroMovimientoArriba = new MovimientoArriba();

        unMovimientoRepetir.agregarMovimiento(movimientoIzquierda);
        unMovimientoRepetir.agregarMovimiento(movimientoDerecha);
        unMovimientoRepetir.agregarMovimiento(movimientoArriba);

        Tablero unTablero = new Tablero();

        Bloque unBloqueRepetir = new Bloque(unMovimientoRepetir);
        Bloque unBloqueLapizAbajo = new Bloque(movimientoLapizAbajo);
        Bloque unBloqueArriba = new Bloque(otroMovimientoArriba);

        unTablero.agregarBloque(unBloqueRepetir);
        unTablero.agregarBloque(unBloqueLapizAbajo);
        unTablero.agregarBloque(unBloqueArriba);

        unTablero.ejecutarSecuencia();

        ArrayList<Dibujo> arregloSectorDibujo = unTablero.mostrarSectorDibujo().mostrarDibujos();
        Dibujo dibujo1 = arregloSectorDibujo.get(0);
        assertFalse(dibujo1.mostrarDibujo());

        Dibujo dibujo2 = arregloSectorDibujo.get((arregloSectorDibujo.size())-1);
        assertTrue(dibujo2.mostrarDibujo());
    }
}



