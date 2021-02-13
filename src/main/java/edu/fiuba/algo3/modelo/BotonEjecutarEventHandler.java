package edu.fiuba.algo3.modelo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class BotonEjecutarEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Ejecuta");
        alert.setContentText("Se ejecuta bien botonEjecutar");
        alert.showAndWait();
    }
}
