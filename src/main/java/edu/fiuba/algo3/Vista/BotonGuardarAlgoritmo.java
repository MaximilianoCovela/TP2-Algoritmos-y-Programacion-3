package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonGuardarAlgoritmo;
import javafx.scene.control.Button;

public class BotonGuardarAlgoritmo extends Button {

    public BotonGuardarAlgoritmo() {
        super();
        this.setText("Guardar algoritmo");
        this.setPrefHeight(30.0);
        this.setPrefWidth(140.0);
        this.setLayoutX(628.0);
        this.setLayoutY(510.0);
        this.setOnAction(new HandlerBotonGuardarAlgoritmo());
    }

}
