package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import javafx.scene.control.Button;

public class BotonMovimientoArriba extends Button implements Boton {
    private HandlerBotonMovimientoArriba accion;

    public BotonMovimientoArriba(PersonajeView unaVistaPersonaje){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoArriba(unaVistaPersonaje);
        this.setOnAction(accion);
    }

    public BotonMovimientoArriba(VboxBotonesSeleccionados vboxbotonesseleccionados, PersonajeView unaVistaPersonaje){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoArriba(vboxbotonesseleccionados, unaVistaPersonaje));
    }

    public void ejecutarAccion(PersonajeView unaVistaPersonaje) {
        accion.mover();

    }
}
