
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoArriba;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;


public class HandlerBotonMovimientoArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;
    private Tablero unTablero;
    private BotonMovimientoArriba unBotonArriba;

    public HandlerBotonMovimientoArriba(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                        Tablero unTablero, BotonMovimientoArriba botonArriba){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonArriba = botonArriba;
    }




    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonArriba)){
            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonArriba);
            MovimientoArriba movArriba = new MovimientoArriba();
            Bloque unBloque = new Bloque(movArriba);
            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonArriba);
        }
    }
}