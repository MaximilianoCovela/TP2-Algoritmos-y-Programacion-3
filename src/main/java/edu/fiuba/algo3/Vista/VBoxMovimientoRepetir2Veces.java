package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class VBoxMovimientoRepetir2Veces extends VBox {

    public VBoxMovimientoRepetir2Veces(){

        this.setPadding(new Insets(10, 0, 0, 10));
        this.setSpacing(10);
        this.setBackground(new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        Label etiqueta = new Label("Holis ");
        this.getChildren().add(etiqueta);

    }

    private MovimientoRepetir movimientoRepetir = new MovimientoRepetir(2);

    public void guardarMovimientos(Movimiento unMovimiento){

        movimientoRepetir.agregarMovimiento(unMovimiento);

    }

    public void actualizarTablero() {

        // esto deberia borrar el movimiento repetir del tablero

    }

    public void eliminarContenido() {

        this.getChildren().clear();

    }

    //public Movimiento agregarMovimientoATablero(){


    //}


}
