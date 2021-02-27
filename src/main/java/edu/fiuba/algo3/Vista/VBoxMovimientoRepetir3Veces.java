package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import javafx.scene.layout.VBox;


public class VBoxMovimientoRepetir3Veces{

    private MovimientoRepetir movimientoRepetir = new MovimientoRepetir(3);

    public void guardarMovimientos(Movimiento unMovimiento){

        movimientoRepetir.agregarMovimiento(unMovimiento);

    }

    public void actualizarTablero() {

        // esto deberia borrar el movimiento repetir del tablero

    }

    public void agregarBloqueATablero() {

        //Bloque unBloqueNuevo = new Bloque(this.movimientoRepetir);

        //this.tablero.agregarBloque(unBloqueNuevo);

    }

    //public Movimiento agregarMovimientoATablero(){


    //}


}