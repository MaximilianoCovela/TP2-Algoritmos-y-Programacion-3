package edu.fiuba.algo3.Vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PanelSectorDibujo extends GridPane {

    public PanelSectorDibujo(){
        this.setLayoutX(22.0);
        this.setLayoutY(21.0);
        this.setPrefHeight(503.0);
        this.setPrefWidth(456.0);
        this.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                this.add(new Rectangle(50.6,55.8, Color.TRANSPARENT),i,j);

            }
        }

        this.setGridLinesVisible(true);

        ImageView imagenVista = new ImageView(new Image("https://i.imgur.com/rcT26Fo.png"));
        this.add(imagenVista,4,4);

    }
}
