package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PanelTablero extends Pane {


    public PanelTablero(PanelBloquesDisponibles panelBloquesDisponibles, PanelBloquesSeleccionados panelBloquesSeleccionados,
                        SectorDibujoView sectorDibujoView, Tablero unTablero, PersonajeView vistaPersonaje,
                        ArrayList<VBoxBotones> arrayVBox, VBoxBotones vBoxActual,
                        VboxBotonesDisponibles vboxBotonesDisponibles){

        // no se si hacer que sea Button o Boton

        this.setPrefHeight(604.0);
        this.setPrefWidth(996.0); // era 946.0
        this.setStyle("-fx-background-color: lightblue");

        Label textoDescriptivoMovimientos = new Label();
        textoDescriptivoMovimientos.setLayoutX(725.0); // era 750.0
        textoDescriptivoMovimientos.setLayoutY(508.0);
        textoDescriptivoMovimientos.prefHeight(63.0);
        textoDescriptivoMovimientos.prefWidth(164.0);
        textoDescriptivoMovimientos.setText(" Movimientos Seleccionados");
        textoDescriptivoMovimientos.setEffect(new ColorAdjust(0,0,0.5,0));
        this.getChildren().add(textoDescriptivoMovimientos);

        Label textoDescriptivoMovimientosDisponibles = new Label();
        textoDescriptivoMovimientosDisponibles.setLayoutX(520.0); // era 545.0
        textoDescriptivoMovimientosDisponibles.setLayoutY(508.0);
        textoDescriptivoMovimientosDisponibles.prefHeight(63.0);
        textoDescriptivoMovimientosDisponibles.prefWidth(164.0);
        textoDescriptivoMovimientosDisponibles.setText("Movimientos Disponibles");
        this.getChildren().add(textoDescriptivoMovimientosDisponibles);

        BotonReiniciar botonReiniciar = new BotonReiniciar(unTablero, panelBloquesSeleccionados.obtenerVBoxBotones(),
                vistaPersonaje, panelBloquesDisponibles.obtenerVBox());

        System.out.println("Quiero ver si aca llega el boton cargado desde antes, o no.");

        BotonSubirBloque botonSubirBloque = new BotonSubirBloque(unTablero, arrayVBox,
                        this, vboxBotonesDisponibles);

        BotonBajarBloque botonBajarBloque = new BotonBajarBloque(unTablero, arrayVBox,
                        this, vboxBotonesDisponibles);

        BotonBorrarBloque botonBorrarBloque = new BotonBorrarBloque(unTablero, arrayVBox,
                this, vboxBotonesDisponibles);

        BotonJugar botonPlay = new BotonJugar(unTablero, vistaPersonaje,botonReiniciar);
        this.getChildren().add(botonPlay);
        this.getChildren().add(botonReiniciar);

        this.getChildren().add(botonSubirBloque);
        this.getChildren().add(botonBajarBloque);

        this.getChildren().add(botonBorrarBloque);

        this.getChildren().add(sectorDibujoView);
        this.getChildren().add(panelBloquesDisponibles);
        this.getChildren().add(panelBloquesSeleccionados);
    }

}
