package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class VboxBotonesSeleccionados extends VBoxBotones {

    Tablero unTablero;


    public VboxBotonesSeleccionados(Tablero unTablero){
        this.setPrefHeight(438.0);
        this.setPrefWidth(172);
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.unTablero = unTablero;
    }

    public void vaciarBotonesSeleccionados(){

        this.getChildren().clear();

    }

    public void actualizarVista(int index){
        while(index < this.getChildren().size()){
            this.getChildren().remove(index);
        }
    }

    @Override
    public void agregarBloqueATablero() {

    }

    public void guardarMovimiento(Movimiento unMovimiento){
       Bloque unBloque = new Bloque(unMovimiento);
       this.unTablero.agregarBloque(unBloque);
    }


    public void eliminarMovimiento(int index){

        this.unTablero.eliminarBloques(index);
    }

    public void actualizarMovimientos(int indexBotonASubir, int i){
        this.unTablero.swapBloques(indexBotonASubir,i);
    }
}
