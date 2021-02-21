package edu.fiuba.algo3.Vista;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesDisponibles extends VBox{

    public VboxBotonesDisponibles(VboxBotonesSeleccionados vboxbotonesseleccionados){
        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);

        BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(vboxbotonesseleccionados);

        BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(vboxbotonesseleccionados);

        BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(vboxbotonesseleccionados);

        BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(vboxbotonesseleccionados);

        BotonMovimientoRepetir2Veces botonRepetir2Veces = new BotonMovimientoRepetir2Veces(vboxbotonesseleccionados);

        BotonMovimientoRepetir3Veces botonRepetir3Veces = new BotonMovimientoRepetir3Veces(vboxbotonesseleccionados);

        BotonMovimientoInvertir botonInvertir = new BotonMovimientoInvertir(vboxbotonesseleccionados);

        BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado(vboxbotonesseleccionados);

        BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo(vboxbotonesseleccionados);

        BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba(vboxbotonesseleccionados);

        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces, botonRepetir3Veces,
                botonInvertir, botonPersonalizado, botonLapizAbajo, botonLapizArriba);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

}
