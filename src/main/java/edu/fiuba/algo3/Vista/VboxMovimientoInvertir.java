package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class VboxMovimientoInvertir extends VBoxBotones {

    private Tablero tablero;

    public VboxMovimientoInvertir(Tablero unTablero){

        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY)));

        this.tablero = unTablero;
    }

    private MovimientoInvertir movimientoInvertir = new MovimientoInvertir();

    public void guardarMovimiento(Movimiento unMovimiento){

        movimientoInvertir.agregarMovimiento(unMovimiento);

    }

    // agrega un bloque complejo al tablero
    public void agregarBloqueATablero() {

        Bloque unBloqueNuevo = new Bloque(this.movimientoInvertir);

        this.tablero.agregarBloque(unBloqueNuevo);

    }

    public Movimiento devolverMovimientos(){
        return this.movimientoInvertir;
    }

    public void eliminarContenido() {

        this.getChildren().clear();

    }

    public void actualizarVista(int index){
        while(index < this.getChildren().size()){
            this.getChildren().remove(index);
        }
    }

    public void eliminarMovimiento(int index){

        this.movimientoInvertir.quitarMovimientos(index);
    }

}
