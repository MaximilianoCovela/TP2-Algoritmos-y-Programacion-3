package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        private Tablero unTablero;

        public HandlerBotonJugar(Tablero unTablero){
            this.unTablero = unTablero;
        }
        public void handle(ActionEvent event) {
            // Acá habría que llamar a ejecutarSecuencia(), hay que ver como pasar el tablero.
            System.out.println("Jugar");
            unTablero.ejecutarSecuencia();
        }
}
