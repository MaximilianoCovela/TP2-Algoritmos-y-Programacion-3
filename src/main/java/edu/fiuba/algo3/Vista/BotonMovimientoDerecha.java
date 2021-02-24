package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoDerecha extends Button{
    private HandlerBotonMovimientoDerecha accion;

    public BotonMovimientoDerecha(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                  PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Derecha");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoDerecha(vboxbotonesseleccionados, unaVistaPersonaje,
                unTablero, this);
        this.setOnAction(accion);
    }

}
