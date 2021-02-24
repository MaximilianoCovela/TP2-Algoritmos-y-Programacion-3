package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoIzquierda;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoDerecha;
import edu.fiuba.algo3.modelo.MovimientoIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class HandlerBotonMovimientoIzquierda implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;
    private Tablero unTablero;
    private BotonMovimientoIzquierda unBotonIzquierda;

    public HandlerBotonMovimientoIzquierda(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                           Tablero unTablero, BotonMovimientoIzquierda botonIzquierda){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonIzquierda = botonIzquierda;
    }



    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonIzquierda)){
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonIzquierda);
            MovimientoIzquierda movIzquierda = new MovimientoIzquierda();
            Bloque unBloque = new Bloque(movIzquierda);
            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonIzquierda);
        }
    }
}
