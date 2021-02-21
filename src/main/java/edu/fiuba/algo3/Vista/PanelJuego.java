package edu.fiuba.algo3.Vista;

import javafx.scene.layout.Pane;

public class PanelJuego extends Pane{

    private PanelTablero Tablero;
    private PanelBloquesDisponibles BloquesDisponibles;
    private PanelBloquesSeleccionados BloquesSeleccionados;
    private PanelSectorDibujo SectorDibujo;


    public PanelJuego(PanelTablero panelTablero, PanelBloquesDisponibles panelBloquesDisponibles, PanelBloquesSeleccionados panelBloquesSeleccionados,
                      PanelSectorDibujo panelSectorDibujo){
        this.setPrefHeight(553.0);
        this.setPrefWidth(804.0);
        this.setStyle("-fx-background-color: lightblue");

        this.Tablero = panelTablero;
        this.BloquesDisponibles = panelBloquesDisponibles;
        this.BloquesSeleccionados = panelBloquesSeleccionados;
        this.SectorDibujo = panelSectorDibujo;

        this.getChildren().add(this.Tablero);
        this.getChildren().add(this.BloquesDisponibles);
        this.getChildren().add(this.BloquesSeleccionados);
        this.getChildren().add(this.SectorDibujo );



    }

}