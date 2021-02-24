package edu.fiuba.algo3.Vista;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesSeleccionados extends VBox {

    public VboxBotonesSeleccionados(){
        this.setPrefHeight(438.0);
        this.setPrefWidth(172);
        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void vaciarBotonesSeleccionados(){

        this.getChildren().clear();

    }
}
