package edu.fiuba.algo3.modelo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

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

    @Test
    public void seVerificaQueLaFiguraSeGuardeConEstadoLapizAbajo() {
        Lapiz unLapiz = new Lapiz();
        Posicion antiguaPosicion = new Posicion();
        Posicion nuevaPosicion = new Posicion();
        nuevaPosicion.setPosicion(1,0);
        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unLapiz.modificarEstadoLapiz(unEstadoLapizAbajo);
        unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);
        ArrayList<Figura> arregloSectorDibujo = unLapiz.mostrarSectorDibujo().mostrarFiguras();
        Figura figura1 = arregloSectorDibujo.get(0);
        Assertions.assertTrue(figura1.seHaDibujado());
    }

    @Test
    public void seVerificaQueLaFiguraSeGuardeConEstadoLapizArriba() {
        Lapiz unLapiz = new Lapiz();
        Posicion antiguaPosicion = new Posicion();
        Posicion nuevaPosicion = new Posicion();
        nuevaPosicion.setPosicion(1,0);
        unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);
        ArrayList<Figura> arregloSectorDibujo = unLapiz.mostrarSectorDibujo().mostrarFiguras();
        Figura figura1 = arregloSectorDibujo.get(0);
        Assertions.assertFalse(figura1.seHaDibujado());
    }
}

