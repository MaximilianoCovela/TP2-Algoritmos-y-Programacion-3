package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import javafx.scene.layout.VBox;


public class VBoxMovimientoRepetir3Veces extends VBox {

    private MovimientoRepetir movimientoRepetir = new MovimientoRepetir(3);

    public void guardarMovimientos(Movimiento unMovimiento){

        movimientoRepetir.agregarMovimiento(unMovimiento);

    }

    public void actualizarTablero() {

        // esto deberia borrar el movimiento repetir del tablero

    }

    //public Movimiento agregarMovimientoATablero(){


    //}


}