package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoAbajo extends Button implements Boton {

    private HandlerBotonMovimientoAbajo accion;

    public BotonMovimientoAbajo(PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(unaVistaPersonaje, unTablero);
        this.setOnAction(accion);
    }

    public BotonMovimientoAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoAbajo(vboxbotonesseleccionados, unaVistaPersonaje,
                unTablero));
    }

    public void ejecutarAccion(PersonajeView unaVistaPersonaje) {
        accion.mover();

    }
}
