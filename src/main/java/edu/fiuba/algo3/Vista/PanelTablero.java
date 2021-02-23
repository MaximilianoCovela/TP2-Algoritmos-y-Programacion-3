package edu.fiuba.algo3.Vista;

import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Pane;

public class PanelTablero extends Pane {

    public PanelTablero(PanelBloquesDisponibles panelBloquesDisponibles, PanelBloquesSeleccionados panelBloquesSeleccionados, SectorDibujoView sectorDibujoView, VboxBotonesSeleccionados vb2){
        this.setPrefHeight(604.0);
        this.setPrefWidth(946.0);
        this.setStyle("-fx-background-color: lightblue");

        Label textoDescriptivoMovimientos = new Label();
        textoDescriptivoMovimientos.setLayoutX(750.0);
        textoDescriptivoMovimientos.setLayoutY(508.0);
        textoDescriptivoMovimientos.prefHeight(63.0);
        textoDescriptivoMovimientos.prefWidth(164.0);
        textoDescriptivoMovimientos.setText(" Movimientos Seleccionados");
        textoDescriptivoMovimientos.setEffect(new ColorAdjust(0,0,0.5,0));
        this.getChildren().add(textoDescriptivoMovimientos);

        Label textoDescriptivoMovimientosDisponibles = new Label();
        textoDescriptivoMovimientosDisponibles.setLayoutX(545.0);
        textoDescriptivoMovimientosDisponibles.setLayoutY(508.0);
        textoDescriptivoMovimientosDisponibles.prefHeight(63.0);
        textoDescriptivoMovimientosDisponibles.prefWidth(164.0);
        textoDescriptivoMovimientosDisponibles.setText("Movimientos Disponibles");
        this.getChildren().add(textoDescriptivoMovimientosDisponibles);


        BotonGuardarAlgoritmo botonGuardarAlgoritmo = new BotonGuardarAlgoritmo();

        BotonJugar botonPlay = new BotonJugar(vb2);

        BotonReiniciar botonReiniciar = new BotonReiniciar();

        this.getChildren().add(botonGuardarAlgoritmo);
        this.getChildren().add(botonPlay);
        this.getChildren().add(botonReiniciar);

        this.getChildren().add(sectorDibujoView);
        this.getChildren().add(panelBloquesDisponibles);
        this.getChildren().add(panelBloquesSeleccionados);
    }


}
