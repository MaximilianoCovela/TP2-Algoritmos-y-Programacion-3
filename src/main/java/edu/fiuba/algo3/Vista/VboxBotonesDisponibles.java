package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesDisponibles extends VBox{

    public VboxBotonesDisponibles(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                  PersonajeView vistaPersonaje, Tablero unTablero){
        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);

        BotonMovimientoArriba botonArriba =
                new BotonMovimientoArriba(vboxbotonesseleccionados, vistaPersonaje, unTablero);

        BotonMovimientoAbajo botonAbajo =
                new BotonMovimientoAbajo(vboxbotonesseleccionados, vistaPersonaje, unTablero);

        BotonMovimientoDerecha botonDerecha =
                new BotonMovimientoDerecha(vboxbotonesseleccionados, vistaPersonaje, unTablero);

        BotonMovimientoIzquierda botonIzquierda =
                new BotonMovimientoIzquierda(vboxbotonesseleccionados, vistaPersonaje, unTablero);

        BotonMovimientoRepetir2Veces botonRepetir2Veces =
                new BotonMovimientoRepetir2Veces(vboxbotonesseleccionados, unTablero);

        BotonMovimientoRepetir3Veces botonRepetir3Veces =
                new BotonMovimientoRepetir3Veces(vboxbotonesseleccionados, unTablero);

        BotonMovimientoInvertir botonInvertir =
                new BotonMovimientoInvertir(vboxbotonesseleccionados, unTablero);

        BotonMovimientoPersonalizado botonPersonalizado =
                new BotonMovimientoPersonalizado(vboxbotonesseleccionados, unTablero);

        BotonMovimientoLapizAbajo botonLapizAbajo =
                new BotonMovimientoLapizAbajo(vboxbotonesseleccionados, vistaPersonaje, unTablero);

        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero);

        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces, botonRepetir3Veces,
                botonInvertir, botonPersonalizado, botonLapizAbajo, botonLapizArriba);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

}
