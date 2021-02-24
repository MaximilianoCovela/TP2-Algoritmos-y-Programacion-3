package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoArriba extends Button {
    private HandlerBotonMovimientoArriba accion;

    public BotonMovimientoArriba(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                 PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoArriba(vboxbotonesseleccionados, unaVistaPersonaje,
                unTablero, this);
        this.setOnAction(accion);
    }

}
