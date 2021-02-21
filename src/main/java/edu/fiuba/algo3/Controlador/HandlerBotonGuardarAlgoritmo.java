package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class HandlerBotonGuardarAlgoritmo implements EventHandler<ActionEvent>{
    public void handle(ActionEvent event) {
        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Nombre del algoritmo");
        tid.setContentText("Por favor introduzca un nombre para el algoritmo");
        Optional<String> texto = tid.showAndWait();
        // Acá se llamaria a GuardarAlgoritmo() de MovimientoPersonalizado pasandole el nombre que ingresó que se recupera con get().
        System.out.println("GuardarAlgoritmo");
    }
}
