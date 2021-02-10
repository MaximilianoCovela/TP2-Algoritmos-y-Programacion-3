package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {
    @Test
    public void testMuevePersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(0,-1);

        personaje.actualizarPosicion(unaPosicion);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(4, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaIzquierda(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(-1,0);

        personaje.actualizarPosicion(unaPosicion);

        assertEquals(4, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(0,1);

        personaje.actualizarPosicion(unaPosicion);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(6, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
        Personaje personaje = new Personaje();
        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(1,0);

        personaje.actualizarPosicion(unaPosicion);

        assertEquals(6, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void seCreaSecuenciaDeBloquesYSeCompruebaQueElPersonajeSeMuevaCorrectamente() {
        Personaje unPersonaje = new Personaje();
        Posicion unaPosicion = new Posicion();
        unaPosicion.setPosicion(1,0);
        unPersonaje.actualizarPosicion(unaPosicion);
        EstadoLapiz unEstadoLapizAbajo = new LapizAbajo();
        unPersonaje.getLapiz().modificarEstadoLapiz(unEstadoLapizAbajo);
        Posicion nuevaPosicion = new Posicion();
        nuevaPosicion.setPosicion(0, 1);
        unPersonaje.actualizarPosicion(nuevaPosicion);
        ArrayList<Figura> arregloSectorDibujo = unPersonaje.getLapiz().mostrarSectorDibujo().mostrarFiguras();
        Figura figura1 = arregloSectorDibujo.get(0);
        assertFalse(figura1.seHaDibujado());
        Figura figura2 = arregloSectorDibujo.get(1);
        assertTrue(figura2.seHaDibujado());
    }
}


