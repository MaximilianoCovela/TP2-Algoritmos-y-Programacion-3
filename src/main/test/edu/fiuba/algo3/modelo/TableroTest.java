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
//import org.mockito.InOrder;

public class TableroTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testAgregarBloqueDerecha(){
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Tablero tablero = new Tablero();
        tablero.agregarBloque(bloqueDerecha);



        //assert(tablero.quitarBloque(bloqueDerecha));

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
}



