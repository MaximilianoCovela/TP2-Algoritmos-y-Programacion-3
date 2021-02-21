package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.MovimientoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class HandlerBotonGuardarAlgoritmo implements EventHandler<ActionEvent>{

    public void handle(ActionEvent event) {
        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Nombre del algoritmo");
        tid.setContentText("Por favor introduzca un nombre para el algoritmo");
        Optional<String> texto = tid.showAndWait();

        /*
        Si selecciona Aceptar sin haber ingresado un nombre lanza alerta.
        */
        if (!texto.isEmpty() && texto.get().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Debe ingresar un nombre para su algoritmo.");
            alert.showAndWait();
        }

        /*
        Si pone un nombre y selecciona aceptar se guarda el algoritmo en un bloque personalizado.
        */
        else if (!texto.isEmpty()) {
            // Acá se llamaría a guardarAlgoritmo() de MovimientoPersonalizado pasándole el nombre que ingresó.
            MovimientoPersonalizado unMovimientoPersonalizado = new MovimientoPersonalizado();
            unMovimientoPersonalizado.guardarAlgoritmo(new Tablero(), texto.get()); // ¿Cómo pasamos el tablero?
        }
    }
}
