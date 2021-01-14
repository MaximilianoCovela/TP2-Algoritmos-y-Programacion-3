package edu.fiuba.algo3.modelo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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



}

