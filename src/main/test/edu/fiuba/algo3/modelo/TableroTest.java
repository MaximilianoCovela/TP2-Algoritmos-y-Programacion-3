package edu.fiuba.algo3.modelo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}



