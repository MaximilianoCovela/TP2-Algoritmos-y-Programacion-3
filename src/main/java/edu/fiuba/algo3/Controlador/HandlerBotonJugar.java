package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.List;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        private VboxBotonesSeleccionados botonesSeleccionados;
        public HandlerBotonJugar(VboxBotonesSeleccionados vb2){
            this.botonesSeleccionados = vb2;
        }
        public void handle(ActionEvent event) {
            // Acá habría que llamar a ejecutarSecuencia(), hay que ver como pasar el tablero.
            System.out.println("Jugar");
            List botones = botonesSeleccionados.getChildren();
        }
}
