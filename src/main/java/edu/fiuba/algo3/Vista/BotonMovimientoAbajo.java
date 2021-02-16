package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import javafx.scene.control.Button;

public class BotonMovimientoAbajo extends Button {

    public BotonMovimientoAbajo(){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoAbajo());
    }
}
