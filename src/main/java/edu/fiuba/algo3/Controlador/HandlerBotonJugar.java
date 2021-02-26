package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        private Tablero unTablero;
        private final PersonajeView unavistaPersonaje;

        public HandlerBotonJugar(Tablero unTablero, PersonajeView vistaPersonaje){
            this.unTablero = unTablero;
            this.unavistaPersonaje = vistaPersonaje;
        }
        public void handle(ActionEvent event) {
            this.unavistaPersonaje.reiniciarVistaPersonaje();
            unTablero.ejecutarSecuencia();
        }
}
