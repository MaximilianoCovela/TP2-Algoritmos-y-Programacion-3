package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LapizTest {

    @Test
    public void testCreoUnLapizYVerificoQueNoPuedoDibujarCuandoElEstadoDelLapizEsteArriba(){
        Lapiz lapiz = new Lapiz();

        assertFalse(lapiz.esPosibleDibujarCamino());
    }

    @Test
    public void testCambioEstadoDeLapizYVerificoQueCambie(){
        Lapiz lapiz = new Lapiz();
        EstadoLapiz estadoLapiz = new LapizAbajo();

        lapiz.modificarEstadoLapiz(estadoLapiz);

        assertTrue(lapiz.esPosibleDibujarCamino());
    }

    @Test
    public void testActualizaPosicionLapizYLaPosicionEsLaEsperada(){
        Lapiz lapiz = new Lapiz();
        Posicion posicion = new Posicion();

        posicion.actualizarPosicion(1,0);

        lapiz.actualizarPosicionLapiz(posicion);

        assertEquals(posicion , (lapiz.getPosicionLapiz()));
    }


}

