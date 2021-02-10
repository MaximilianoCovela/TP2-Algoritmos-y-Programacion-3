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

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAIzquierda);

        tablero.ejecutarSecuencia();
        assertEquals(4,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueADerechaEjecutoLaSecuenciaYElPersonajeSeMueveADerecha(){
        Bloque unBloqueADerecha = new Bloque(new MovimientoDerecha());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueADerecha);

        tablero.ejecutarSecuencia();
        assertEquals(6,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueAArribaEjecutoLaSecuenciaYElPersonajeSeMueveAArriba(){
        Bloque unBloqueAArriba = new Bloque(new MovimientoArriba());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAArriba);

        tablero.ejecutarSecuencia();
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(6,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueAAbajoEjecutoLaSecuenciaYElPersonajeSeMueveAAbajo(){
        Bloque unBloqueAAbajo = new Bloque(new MovimientoAbajo());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAAbajo);

        tablero.ejecutarSecuencia();
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(4,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloquesEjecutoLaSecuenciaYSeModificaLaPosicionDelPersonaje(){

        Bloque unBloqueADerecha = new Bloque(new MovimientoDerecha());
        Bloque unBloqueAIzquierda = new Bloque(new MovimientoIzquierda());
        Bloque unBloqueAAbajo = new Bloque(new MovimientoAbajo());
        Bloque otroBloqueAAbajo = new Bloque(new MovimientoAbajo());
        Bloque unBloqueAArriba = new Bloque(new MovimientoArriba());

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueADerecha);
        tablero.agregarBloque(unBloqueAIzquierda);
        tablero.agregarBloque(unBloqueAAbajo);
        tablero.agregarBloque(otroBloqueAAbajo);
        tablero.agregarBloque(unBloqueAArriba);

        tablero.ejecutarSecuencia();
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(4,tablero.getPersonaje().getPosicionActual().getValorVertical());

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

        Tablero unTablero = new Tablero();

        Bloque unBloqueRepetir = new Bloque(unMovimientoRepetir);

        unTablero.agregarBloque(unBloqueRepetir);

        unTablero.ejecutarSecuencia();

        assertEquals(5, (unTablero.getPersonaje().getPosicionActual().getValorHorizontal()));
        assertEquals(7, (unTablero.getPersonaje().getPosicionActual().getValorVertical()));

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

        ArrayList<Figura> arregloSectorDibujo = unTablero.getPersonaje().getLapiz().mostrarSectorDibujo().mostrarFiguras();
        Figura figura1 = arregloSectorDibujo.get(0);
        assertFalse(figura1.seHaDibujado());

        Figura figura2 = arregloSectorDibujo.get((arregloSectorDibujo.size())-1);
        assertTrue(figura2.seHaDibujado());
    }
}



