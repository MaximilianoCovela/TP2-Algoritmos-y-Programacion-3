package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {
    @Test
    public void testMuevePersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoAbajo();

        personaje.mover(movimiento);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(4, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
        Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoArriba();

        personaje.mover(movimiento);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(6, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
        Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoDerecha();

        personaje.mover(movimiento);

        assertEquals(6, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaLaIzquierda(){
        Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoIzquierda();

        personaje.mover(movimiento);

        assertEquals(4, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));

    }
}

