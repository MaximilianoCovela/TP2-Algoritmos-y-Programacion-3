package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoAbajo;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import  edu.fiuba.algo3.modelo.Bloque;

public class HandlerBotonMovimientoAbajo implements EventHandler<ActionEvent>{

    private final PersonajeView vistaPersonaje;
    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoAbajo unBotonAbajo;

    public HandlerBotonMovimientoAbajo(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                       Tablero unTablero, BotonMovimientoAbajo botonAbajo){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonAbajo = botonAbajo;
    }


    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonAbajo)){

            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);

            this.vboxbotonesseleccionados.getChildren().add(botonAbajo);
            MovimientoAbajo movAbajo = new MovimientoAbajo();
            Bloque unBloque = new Bloque(movAbajo);
            this.unTablero.agregarBloque(unBloque);

        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonAbajo);
        }
    }
}
