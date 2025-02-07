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
    public void seVerificaQueElDibujoSeGuardeConEstadoLapizAbajo() {
        Lapiz unLapiz = new Lapiz();
        Posicion antiguaPosicion = new Posicion();
        Posicion nuevaPosicion = new Posicion(6,5);

        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unLapiz.modificarEstadoLapiz(unEstadoLapizAbajo);
        Linea unDibujo = (Linea) unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);

        Assertions.assertTrue(unDibujo.mostrarDibujo());
        Assertions.assertTrue((unDibujo).posicionLineaEsIgualA(antiguaPosicion, nuevaPosicion));
    }

    @Test
    public void seVerificaQueElDibujoSeGuardeConEstadoLapizArriba() {
        Lapiz unLapiz = new Lapiz();
        Posicion antiguaPosicion = new Posicion();
        Posicion nuevaPosicion = new Posicion(1,0);

        Vacio unDibujo = (Vacio) unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);

        Assertions.assertFalse(unDibujo.mostrarDibujo());
        Assertions.assertTrue(unDibujo.posicionVacioEsIgualA(nuevaPosicion));
    }
}

