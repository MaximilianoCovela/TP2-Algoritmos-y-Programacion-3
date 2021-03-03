package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PanelTablero extends Pane {


    public PanelTablero(PanelBloquesDisponibles panelBloquesDisponibles, PanelBloquesSeleccionados panelBloquesSeleccionados,
                        SectorDibujoView sectorDibujoView, Tablero unTablero, PersonajeView vistaPersonaje,
                        ArrayList<VBoxBotones> arrayVBox,
                        VboxBotonesDisponibles vboxBotonesDisponibles){

        this.setPrefHeight(604.0);
        this.setPrefWidth(996.0);
        this.setStyle("-fx-background-color: lightblue");

        Label textoDescriptivoMovimientos = new Label();
        textoDescriptivoMovimientos.setLayoutX(725.0);
        textoDescriptivoMovimientos.setLayoutY(508.0);
        textoDescriptivoMovimientos.prefHeight(63.0);
        textoDescriptivoMovimientos.prefWidth(164.0);
        textoDescriptivoMovimientos.setText(" Movimientos Seleccionados");
        textoDescriptivoMovimientos.setEffect(new ColorAdjust(0,0,0.5,0));
        this.getChildren().add(textoDescriptivoMovimientos);

        Label textoDescriptivoMovimientosDisponibles = new Label();
        textoDescriptivoMovimientosDisponibles.setLayoutX(520.0);
        textoDescriptivoMovimientosDisponibles.setLayoutY(508.0);
        textoDescriptivoMovimientosDisponibles.prefHeight(63.0);
        textoDescriptivoMovimientosDisponibles.prefWidth(164.0);
        textoDescriptivoMovimientosDisponibles.setText("Movimientos Disponibles");
        this.getChildren().add(textoDescriptivoMovimientosDisponibles);

        BotonReiniciar botonReiniciar = new BotonReiniciar(unTablero, panelBloquesSeleccionados.obtenerVBoxBotones(),
                vistaPersonaje, panelBloquesDisponibles.obtenerVBox());

        BotonSubirBloque botonSubirBloque = new BotonSubirBloque(unTablero, arrayVBox,
                        this, vboxBotonesDisponibles);

        BotonBajarBloque botonBajarBloque = new BotonBajarBloque(unTablero, arrayVBox,
                        this, vboxBotonesDisponibles);

        BotonBorrarBloque botonBorrarBloque = new BotonBorrarBloque(unTablero, arrayVBox,
                this, vboxBotonesDisponibles);

        BotonJugar botonPlay = new BotonJugar(unTablero, vistaPersonaje,botonReiniciar);

        BotonMenu botonMenu = new BotonMenu();

        unTablero.mostrarSectorDibujo().addObserver(botonReiniciar);
        unTablero.mostrarSectorDibujo().addObserver(botonSubirBloque);
        unTablero.mostrarSectorDibujo().addObserver(botonBajarBloque);
        unTablero.mostrarSectorDibujo().addObserver(botonPlay);
        unTablero.mostrarSectorDibujo().addObserver(botonBorrarBloque);


        this.getChildren().add(botonPlay);
        this.getChildren().add(botonReiniciar);

        this.getChildren().add(botonSubirBloque);
        this.getChildren().add(botonBajarBloque);

        this.getChildren().add(botonBorrarBloque);
        this.getChildren().add(botonMenu);

        this.getChildren().add(sectorDibujoView);
        this.getChildren().add(panelBloquesDisponibles);
        this.getChildren().add(panelBloquesSeleccionados);
    }

}
