package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class VBoxMovimientoRepetir3Veces extends VBoxBotones{
    private Tablero tablero;

    public VBoxMovimientoRepetir3Veces(Tablero unTablero){

        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY)));

        this.tablero = unTablero;

    }

    private MovimientoRepetir movimientoRepetir = new MovimientoRepetir(3);

    public void guardarMovimiento(Movimiento unMovimiento){

        movimientoRepetir.agregarMovimiento(unMovimiento);

    }

    // agrega un bloque complejo al tablero
    public void agregarBloqueATablero() {

        Bloque unBloqueNuevo = new Bloque(this.movimientoRepetir);

        this.tablero.agregarBloque(unBloqueNuevo);

    }

    public Movimiento devolverMovimientos(){
        return this.movimientoRepetir;
    }

    public void eliminarContenido() {

        this.getChildren().clear();

    }

    public void actualizarVista(int index){
        while(index < this.getChildren().size()){
            this.getChildren().remove(index);
        }
    }

    public Boton getBotonSeleccionado(){
        return null;
    }

    public void eliminarMovimiento(int index){

        this.movimientoRepetir.quitarMovimientos(index);
    }

}