package edu.fiuba.algo3.modelo;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InOrder;

public class TableroTest {
    @Test
    public void testAgregarBloqueDerecha(){
        BloqueDerecha bloqueDerecha = new BloqueDerecha();
        Tablero tablero = new Tablero();
        tablero.agregarBloque(bloqueDerecha);

        //assertEquals(1,)
    }
}
