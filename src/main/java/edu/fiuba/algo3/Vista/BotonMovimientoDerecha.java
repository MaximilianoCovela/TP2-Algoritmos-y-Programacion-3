package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoDerecha;
import javafx.scene.control.Button;

public class BotonMovimientoDerecha extends Button implements Boton {
    private HandlerBotonMovimientoDerecha accion;
    public BotonMovimientoDerecha(PersonajeView unaVistaPersonaje){
        super();
        this.setText("Derecha");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoDerecha( unaVistaPersonaje);
        this.setOnAction(accion);
    }

    public BotonMovimientoDerecha(VboxBotonesSeleccionados vboxbotonesseleccionados, PersonajeView unaVistaPersonaje){
        super();
        this.setText("Derecha");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoDerecha(vboxbotonesseleccionados, unaVistaPersonaje));
    }

    public void ejecutarAccion(PersonajeView unaVistaPersonaje) {
        accion.mover();

    }
}
