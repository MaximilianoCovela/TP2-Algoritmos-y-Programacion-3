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
        int index = 0;
        BotonMovimientoArriba botonArriba =
                new BotonMovimientoArriba(vboxbotonesseleccionados, unTablero, index);

        BotonMovimientoAbajo botonAbajo =
                new BotonMovimientoAbajo(vboxbotonesseleccionados, unTablero,index);

        BotonMovimientoDerecha botonDerecha =
                new BotonMovimientoDerecha(vboxbotonesseleccionados, unTablero,index);

        BotonMovimientoIzquierda botonIzquierda =
                new BotonMovimientoIzquierda(vboxbotonesseleccionados, unTablero,index);

        BotonMovimientoRepetir2Veces botonRepetir2Veces =
                new BotonMovimientoRepetir2Veces(vboxbotonesseleccionados, unTablero,index);

        BotonMovimientoRepetir3Veces botonRepetir3Veces =
                new BotonMovimientoRepetir3Veces(vboxbotonesseleccionados, unTablero);
        /*
        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero,index);
                Cerrar repetir
         */

        BotonMovimientoInvertir botonInvertir =
                new BotonMovimientoInvertir(vboxbotonesseleccionados, unTablero);

        /*
        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero,index);
                Cerrar Invertir
         */

        BotonMovimientoPersonalizado botonPersonalizado =
                new BotonMovimientoPersonalizado(vboxbotonesseleccionados, unTablero);

        /*
        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero,index);
                Cerrar Personalizado
         */

        BotonMovimientoLapizAbajo botonLapizAbajo =
                new BotonMovimientoLapizAbajo(vboxbotonesseleccionados, unTablero,index);

        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero,index);

        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces, botonRepetir3Veces,
                botonInvertir, botonPersonalizado, botonLapizAbajo, botonLapizArriba);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

}
