package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            // Acá habría que llamar a ejecutarSecuencia(), hay que ver como pasar el tablero.
            System.out.println("Jugar");
        }
}
