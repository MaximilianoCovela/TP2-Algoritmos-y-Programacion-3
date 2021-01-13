package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {
    @Test
    /*public void testMuevePersonajeHaciaAbajo(){
        Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoAbajo();

        personaje.actualizarPosicion(movimiento);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(4, (personaje.getPosicionActual().getValorVertical()));

    } */

    public void testCreoUnBloqueIzquierdaYCreaUnMovimientoQueMueveAlPersonajeALaIzquierda(){
        Bloque bloqueIzquierda = new Bloque(new MovimientoIzquierda());
        Personaje unPersonaje = new Personaje();

        bloqueIzquierda.aplicarMovimiento(unPersonaje);

        assertEquals(4, (unPersonaje.getPosicionActual().getValorHorizontal()));
        assertEquals(5, (unPersonaje.getPosicionActual().getValorVertical()));

    }

    @Test
    public void testMuevePersonajeHaciaArriba(){
    /*    Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoArriba();

        personaje.actualizarPosicion(movimiento);

        assertEquals(5, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(6, (personaje.getPosicionActual().getValorVertical()));
    */
    }

    @Test
    public void testMuevePersonajeHaciaLaDerecha(){
    /*    Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoDerecha();

        personaje.actualizarPosicion(movimiento);

        assertEquals(6, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));
     */
    }

    @Test
    public void testMuevePersonajeHaciaLaIzquierda(){
    /*    Personaje personaje = new Personaje();
        Movimiento movimiento = new MovimientoIzquierda();

        personaje.actualizarPosicion(movimiento);

        assertEquals(4, (personaje.getPosicionActual().getValorHorizontal()));

        assertEquals(5, (personaje.getPosicionActual().getValorVertical()));
     */
    }
}

