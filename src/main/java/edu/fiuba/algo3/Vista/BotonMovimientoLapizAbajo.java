package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoIzquierda;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizAbajo;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoLapizAbajo extends Button {

    private HandlerBotonMovimientoLapizAbajo accion;

    public BotonMovimientoLapizAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                     Tablero unTablero, int index, VboxBotonesDisponibles vbd){

        super();
        this.setText("Lapiz Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoLapizAbajo(vboxbotonesseleccionados,
                unTablero, this, index, vbd);
        this.setOnAction(accion);
    }



}
