package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {
    @Test
    public void messageGreeting() {
        Message message = new Message("Hello world!");

        assertEquals("Hello world!", message.greet());
    }
}
