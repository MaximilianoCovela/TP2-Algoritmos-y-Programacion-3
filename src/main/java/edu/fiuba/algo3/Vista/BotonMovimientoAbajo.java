package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoAbajo extends Button {

    private HandlerBotonMovimientoAbajo accion;

    public BotonMovimientoAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(vboxbotonesseleccionados, unaVistaPersonaje,
                unTablero, this);
        this.setOnAction(accion);
    }

}
