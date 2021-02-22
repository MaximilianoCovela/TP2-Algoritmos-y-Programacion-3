package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoIzquierda;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoIzquierda implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;

    public HandlerBotonMovimientoIzquierda(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public HandlerBotonMovimientoIzquierda(PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(this.vistaPersonaje);
            this.vboxbotonesseleccionados.getChildren().add(botonIzquierda);
        }else{
            vistaPersonaje.actualizarPosicion(-1,0);
        }
    }
}
