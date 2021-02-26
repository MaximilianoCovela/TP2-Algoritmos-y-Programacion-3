package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoLapizArriba extends Button {

    private HandlerBotonMovimientoLapizArriba accion;

    public BotonMovimientoLapizArriba(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                      Tablero unTablero, int index){
        super();
        this.setText("Lapiz Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoLapizArriba(vboxbotonesseleccionados,
                unTablero, this, index);
        this.setOnAction(accion);
    }

}
