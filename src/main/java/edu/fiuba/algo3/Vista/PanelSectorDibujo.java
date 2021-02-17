package edu.fiuba.algo3.Vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class PanelSectorDibujo extends Pane {

    public PanelSectorDibujo(){
        this.setLayoutX(3.0);
        this.setLayoutY(4.0);
        this.setPrefHeight(491.0);
        this.setPrefWidth(375.0);
        this.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");

        ImageView imagenVista = new ImageView(new Image("https://i.imgur.com/r0jDjwZ.png"));
        this.getChildren().add(imagenVista);
    }
}
