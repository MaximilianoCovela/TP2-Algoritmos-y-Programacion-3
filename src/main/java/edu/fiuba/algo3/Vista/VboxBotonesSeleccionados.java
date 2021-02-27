package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class VboxBotonesSeleccionados extends VBoxBotones {

    public VboxBotonesSeleccionados(){
        this.setPrefHeight(438.0);
        this.setPrefWidth(172);
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
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
        // solo para implementar la interfaz por ahora
    }
}
