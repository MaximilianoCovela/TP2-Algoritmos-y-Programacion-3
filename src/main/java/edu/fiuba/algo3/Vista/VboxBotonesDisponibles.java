package edu.fiuba.algo3.Vista;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesDisponibles extends VBox{

    public VboxBotonesDisponibles(){
        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);

        BotonMovimientoArriba botonArriba = new BotonMovimientoArriba();

        BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo();

        BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha();

        BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda();

        BotonMovimientoRepetir2Veces botonRepetir2Veces = new BotonMovimientoRepetir2Veces();

        BotonMovimientoRepetir3Veces botonRepetir3Veces = new BotonMovimientoRepetir3Veces();

        BotonMovimientoInvertir botonInvertir = new BotonMovimientoInvertir();

        BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado();

        BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo();

        BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba();

        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces, botonRepetir3Veces,
                botonInvertir, botonPersonalizado, botonLapizAbajo, botonLapizArriba);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

}
