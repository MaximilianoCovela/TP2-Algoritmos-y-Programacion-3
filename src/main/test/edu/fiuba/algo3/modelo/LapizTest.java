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
        Posicion nuevaPosicion = new Posicion(6,5);

        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unLapiz.modificarEstadoLapiz(unEstadoLapizAbajo);
        unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);

        ArrayList<Dibujo> arregloSectorDibujo = unLapiz.mostrarSectorDibujo().mostrarDibujos();
        Linea dibujo1 = (Linea) arregloSectorDibujo.get(0);
        Assertions.assertTrue(dibujo1.mostrarDibujo());
        Assertions.assertTrue(dibujo1.posicionLineaEsIgualA(antiguaPosicion, nuevaPosicion));
    }

    @Test
    public void seVerificaQueLaFiguraSeGuardeConEstadoLapizArriba() {
        Lapiz unLapiz = new Lapiz();
        Posicion antiguaPosicion = new Posicion();
        Posicion nuevaPosicion = new Posicion(1,0);

        unLapiz.dibujarCamino(antiguaPosicion, nuevaPosicion);

        ArrayList<Dibujo> arregloSectorDibujo = unLapiz.mostrarSectorDibujo().mostrarDibujos();
        Vacio dibujo1 = (Vacio) arregloSectorDibujo.get(0);
        Assertions.assertFalse(dibujo1.mostrarDibujo());
        Assertions.assertTrue(dibujo1.posicionVacioEsIgualA(nuevaPosicion));
    }
}

