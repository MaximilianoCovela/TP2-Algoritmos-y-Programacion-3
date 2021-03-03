package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class VboxBotonesDisponibles extends VBox{

    private VboxBotonesSeleccionados vBoxSeleccionados;

    private Boton botonSeleccionado;

    private ArrayList<VBoxBotones> listaDeVBox = new ArrayList<>();

    public VboxBotonesDisponibles(VboxBotonesSeleccionados vboxBotonesSeleccionados, Tablero unTablero){
        this.vBoxSeleccionados = vboxBotonesSeleccionados;
        this.listaDeVBox.add(vboxBotonesSeleccionados);

        this.botonSeleccionado = null;

        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);
        int index = 0;

        BotonMovimientoArriba botonArriba =
                new BotonMovimientoArriba(vboxBotonesSeleccionados, unTablero, index, this,
                        listaDeVBox);
        BotonMovimientoAbajo botonAbajo =
                new BotonMovimientoAbajo(vboxBotonesSeleccionados, unTablero,index, this, listaDeVBox);

        BotonMovimientoDerecha botonDerecha =
                new BotonMovimientoDerecha(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        BotonMovimientoIzquierda botonIzquierda =
                new BotonMovimientoIzquierda(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);


        BotonMovimientoRepetir2Veces botonRepetir2Veces =
                new BotonMovimientoRepetir2Veces(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        BotonMovimientoPararRepetir2Veces botonPararRepetir2Veces =
                new BotonMovimientoPararRepetir2Veces(vboxBotonesSeleccionados, unTablero,index,
                        listaDeVBox);

        BotonMovimientoRepetir3Veces botonRepetir3Veces =
                new BotonMovimientoRepetir3Veces(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        BotonMovimientoPararRepetir3Veces botonPararRepetir3Veces =
                new BotonMovimientoPararRepetir3Veces(vboxBotonesSeleccionados, unTablero,index,
                        listaDeVBox);


        BotonMovimientoInvertir botonInvertir =
                new BotonMovimientoInvertir(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        BotonMovimientoPararInvertir botonPararInvertir = new BotonMovimientoPararInvertir(vboxBotonesSeleccionados, unTablero,index,
                        listaDeVBox);


        BotonGuardarAlgoritmo botonGuardarAlgoritmo =
                new BotonGuardarAlgoritmo(vboxBotonesSeleccionados, this, unTablero, index);


        BotonMovimientoLapizAbajo botonLapizAbajo =
                new BotonMovimientoLapizAbajo(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        BotonMovimientoLapizArriba botonLapizArriba =
                new BotonMovimientoLapizArriba(vboxBotonesSeleccionados, unTablero,index, this,
                        listaDeVBox);

        botonGuardarAlgoritmo.setDisable(true);
        this.getChildren().addAll(botonArriba, botonAbajo, botonDerecha, botonIzquierda, botonRepetir2Veces,
                botonPararRepetir2Veces, botonRepetir3Veces, botonPararRepetir3Veces, botonInvertir, botonPararInvertir, botonLapizAbajo,
                botonLapizArriba, botonGuardarAlgoritmo);

        this.setPrefHeight(500);
        this.setPrefWidth(172);

        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public void verificar() {
        int tamanio_vbdisponibles = this.getChildren().size();
        if (vBoxSeleccionados.getChildren().size() >= 1) {
            this.getChildren().get(tamanio_vbdisponibles - 1).setDisable(false);
            return;
        }
        this.getChildren().get(tamanio_vbdisponibles - 1).setDisable(true);
    }

    public void vaciarListaVBox() {

        this.listaDeVBox.clear();
        this.listaDeVBox.add(this.vBoxSeleccionados);

    }

    public ArrayList<VBoxBotones> getListaVBox(){

        return listaDeVBox;

    }


    public void cambiarBotonSeleccionado(Boton nuevoBotonSeleccionado){

        this.botonSeleccionado = nuevoBotonSeleccionado;

    }

    public Boton getBotonSeleccionado() {

        return this.botonSeleccionado;

    }
}
