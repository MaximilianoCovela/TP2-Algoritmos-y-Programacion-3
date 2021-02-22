package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoAbajo;
import edu.fiuba.algo3.Vista.PersonajeView;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HandlerBotonMovimientoAbajo implements EventHandler<ActionEvent>{

    private final PersonajeView vistaPersonaje;
    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoAbajo(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public HandlerBotonMovimientoAbajo(PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(this.vistaPersonaje);
            this.vboxbotonesseleccionados.getChildren().add(botonAbajo);
        }else{
            // aca hacemos lo de moverse, hardcodeado
            vistaPersonaje.actualizarPosicion(0,1);
            vistaPersonaje.actualizarImagen(new Image("https://i.imgur.com/rcT26Fo.png"));
        }

    }
}
