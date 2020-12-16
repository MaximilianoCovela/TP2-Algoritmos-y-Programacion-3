package edu.fiuba.algo3.modelo;

//import static org.mockito.Mockito.atLeast;
//import static org.mockito.Mockito.atLeastOnce;
//import static org.mockito.Mockito.atMost;
//import static org.mockito.Mockito.inOrder;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.never;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import org.mockito.InOrder;

public class TableroTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAgregarBloqueDerecha(){
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Tablero tablero = new Tablero();
        tablero.agregarBloque(bloqueDerecha);

    }

    @Test
    public void testAgregoBloqueDerechaEIntentoQuitarBloqueInexistente(){
        BloqueMovible bloqueIzquierda = new BloqueIzquierda();
        BloqueMovible bloqueDerecha = new BloqueDerecha();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(bloqueDerecha);

        expectedException.expect(BloqueNoEncontradoException.class);

        tablero.quitarBloque(bloqueIzquierda);
    }

    @Test
    public void testAgregoBloqueDerechaYReinicioTableroYNoTengoBloquesEnElTablero(){
        BloqueMovible bloqueDerecha = new BloqueDerecha();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(bloqueDerecha);

        tablero.reiniciarTablero();

        expectedException.expect(BloqueNoEncontradoException.class);

        tablero.quitarBloque(bloqueDerecha);

    }

    @Test
    public void testAgregoBloqueAIzquierdaEjecutoLaSecuenciaYElPersonajeSeMueveAIzquierda(){
        BloqueMovible unBloqueAIzquierda = new BloqueIzquierda();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAIzquierda);

        tablero.ejecutarSecuencia();
        assertEquals(4,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueADerechaEjecutoLaSecuenciaYElPersonajeSeMueveADerecha(){
        BloqueMovible unBloqueADerecha = new BloqueDerecha();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueADerecha);

        tablero.ejecutarSecuencia();
        assertEquals(6,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueAArribaEjecutoLaSecuenciaYElPersonajeSeMueveAArriba(){
        BloqueMovible unBloqueAArriba = new BloqueArriba();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAArriba);

        tablero.ejecutarSecuencia();
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(6,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloqueAAbajoEjecutoLaSecuenciaYElPersonajeSeMueveAAbajo(){
        BloqueMovible unBloqueAAbajo = new BloqueAbajo();

        Tablero tablero = new Tablero();

        tablero.agregarBloque(unBloqueAAbajo);

        tablero.ejecutarSecuencia();
        assertEquals(5,tablero.getPersonaje().getPosicionActual().getValorHorizontal());
        assertEquals(4,tablero.getPersonaje().getPosicionActual().getValorVertical());

    }

    @Test
    public void testAgregoBloquesEjecutoLaSecuenciaYSeModificaLaPosicionDelPersonaje(){

        BloqueMovible unBloqueADerecha = new BloqueDerecha();
        BloqueMovible unBloqueAIzquierda = new BloqueIzquierda();
        BloqueMovible unBloqueAAbajo = new BloqueAbajo();
        BloqueMovible otroBloqueAAbajo = new BloqueAbajo();
        BloqueMovible unBloqueAArriba = new BloqueArriba();

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



