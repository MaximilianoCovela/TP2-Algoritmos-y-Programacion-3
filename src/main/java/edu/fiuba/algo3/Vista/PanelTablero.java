package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.Group;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class PanelTablero extends Pane {

    public PanelTablero(PanelBloquesDisponibles panelBloquesDisponibles, PanelBloquesSeleccionados panelBloquesSeleccionados, PanelSectorDibujo panelSectorDibujo){
        this.setPrefHeight(553.0);
        this.setPrefWidth(804.0);
        this.setStyle("-fx-background-color: lightblue");

        Label textoDescriptivoMovimientos = new Label();
        textoDescriptivoMovimientos.setLayoutX(622.0);
        textoDescriptivoMovimientos.setLayoutY(479.0);
        textoDescriptivoMovimientos.prefHeight(63.0);
        textoDescriptivoMovimientos.prefWidth(164.0);
        textoDescriptivoMovimientos.setText(" Movimientos Seleccionados");
        textoDescriptivoMovimientos.setEffect(new ColorAdjust(0,0,0.5,0));
        this.getChildren().add(textoDescriptivoMovimientos);

        BotonJugar botonPlay = new BotonJugar();

        BotonReiniciar botonReiniciar = new BotonReiniciar();

        this.getChildren().add(botonPlay);
        this.getChildren().add(botonReiniciar);

        this.getChildren().add(panelSectorDibujo);
        this.getChildren().add(panelBloquesDisponibles);
        this.getChildren().add(panelBloquesSeleccionados);
    }


}
