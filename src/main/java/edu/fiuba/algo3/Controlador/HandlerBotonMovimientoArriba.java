
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoArriba;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class HandlerBotonMovimientoArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;

    public HandlerBotonMovimientoArriba(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public HandlerBotonMovimientoArriba(PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
    }


    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(this.vistaPersonaje);
            this.vboxbotonesseleccionados.getChildren().add(botonArriba);
        }else{
            vistaPersonaje.actualizarPosicion(0,-1);
        }
    }
}