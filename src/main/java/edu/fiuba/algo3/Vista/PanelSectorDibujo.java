package edu.fiuba.algo3.Vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class PanelSectorDibujo extends GridPane {

    public PanelSectorDibujo(){
        this.setLayoutX(22.0);
        this.setLayoutY(21.0);
        this.setPrefHeight(503.0);
        this.setPrefWidth(456.0);
        this.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");
        ImageView imagenVista = new ImageView(new Image("https://i.imgur.com/r0jDjwZ.png"));
        this.getChildren().add(imagenVista);
    }
}
