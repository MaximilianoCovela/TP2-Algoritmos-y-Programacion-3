package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesDisponibles extends VBox{
    private VboxBotonesSeleccionados vbs;

    public VboxBotonesDisponibles(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                  PersonajeView vistaPersonaje, Tablero unTablero){
        this.vbs = vboxbotonesseleccionados;
        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);
        int index = 0;

        //Botones simples

        BotonMovimientoArriba botonArriba =
                new BotonMovimientoArriba(vboxbotonesseleccionados, unTablero, index, this);

        BotonMovimientoAbajo botonAbajo =
                new BotonMovimientoAbajo(vboxbotonesseleccionados, unTablero,index, this);

        BotonMovimientoDerecha botonDerecha =
                new BotonMovimientoDerecha(vboxbotonesseleccionados, unTablero,index, this);

        BotonMovimientoIzquierda botonIzquierda =
                new BotonMovimientoIzquierda(vboxbotonesseleccionados, unTablero,index, this);


        //Botones mas complejos

        BotonMovimientoRepetir2Veces botonRepetir2Veces =
                new BotonMovimientoRepetir2Veces(vboxbotonesseleccionados, unTablero,index, this);

        BotonMovimientoPararRepetir2Veces botonPararRepetir2Veces =
                new BotonMovimientoPararRepetir2Veces(vboxbotonesseleccionados, unTablero,index);


        BotonMovimientoRepetir3Veces botonRepetir3Veces =
                new BotonMovimientoRepetir3Veces(vboxbotonesseleccionados, unTablero,index,this);

        BotonMovimientoPararRepetir2Veces botonPararRepetir3Veces =
                new BotonMovimientoPararRepetir2Veces(vboxbotonesseleccionados, unTablero,index);


        //Invertir

        BotonMovimientoInvertir botonInvertir =
                new BotonMovimientoInvertir(vboxbotonesseleccionados, unTablero);


        //Guardar algoritmo

        BotonGuardarAlgoritmo botonGuardarAlgoritmo =
                new BotonGuardarAlgoritmo(vboxbotonesseleccionados, this, unTablero, index);

        //Lapiz

        BotonMovimientoLapizAbajo botonLapizAbajo =
                new BotonMovimientoLapizAbajo(vboxbotonesseleccionados, unTablero,index, this);

        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxbotonesseleccionados, unTablero,index, this);



        botonGuardarAlgoritmo.setDisable(true); /* Se deshabilita cuando no hay nada en el vbox seleccionados.*/
        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces,
                botonPararRepetir2Veces, botonRepetir3Veces, botonPararRepetir3Veces, botonInvertir, botonLapizAbajo,
                botonLapizArriba, botonGuardarAlgoritmo);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void verificar() {
        int tamanio_vbdisponibles = this.getChildren().size();
        if (vbs.getChildren().size() >= 1) {
            this.getChildren().get(tamanio_vbdisponibles - 1).setDisable(false);
            return;
        }
        this.getChildren().get(tamanio_vbdisponibles - 1).setDisable(true);
    }

}
