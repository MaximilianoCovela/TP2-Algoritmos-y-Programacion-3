package edu.fiuba.algo3.Vista;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import edu.fiuba.algo3.modelo.Dibujo;

public class SectorDibujoView extends GridPane {

    public SectorDibujoView(){
        this.setLayoutX(12.0);
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
    }

    public void agregarImagenInicial(ImageView imagen){
        this.add(imagen, 4,4);
    }

    public void marcarCelda(int posicionHorizontal, int posicionVertical , Dibujo unDibujo){

        ImageView imagen = new ImageView(new Image("https://i.imgur.com/efY9vTX.png"));
        imagen.toBack();
        if (unDibujo.mostrarDibujo()){
            this.add(imagen, posicionHorizontal, posicionVertical);

        }

    }

    public void borrarCaminosRealizados(ImageView imagenPersonaje){

        this.getChildren().clear();

        this.setLayoutX(12.0);
        this.setLayoutY(21.0);
        this.setPrefHeight(503.0);
        this.setPrefWidth(456.0);
        this.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                this.add(new Rectangle(50.6,55.8, Color.TRANSPARENT),i,j);

            }
        }

        this.setGridLinesVisible(false);
        this.setGridLinesVisible(true);
        this.agregarImagenInicial(imagenPersonaje);
    }

    public void actualizarVistaPersonajeEnSectorDibujo(int posicionHorizontal, int posicionVertical, ImageView imagenPersonaje) {

        this.getChildren().remove(imagenPersonaje);
        this.add(imagenPersonaje, posicionHorizontal,posicionVertical);
        setRowIndex(imagenPersonaje, posicionVertical);
        setColumnIndex(imagenPersonaje, posicionHorizontal);

    }

}
