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

    public HandlerBotonMovimientoIzquierda(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                           Tablero unTablero){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }

    public HandlerBotonMovimientoIzquierda(PersonajeView unaVistaPersonaje, Tablero unTablero){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }

    public void mover(){
        vistaPersonaje.actualizarPosicion(-1,0);
        vistaPersonaje.actualizarImagen(new Image("https://imgur.com/npbSGMe.png"));

    }


    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(this.vistaPersonaje,
                    this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonIzquierda);
        }else{
            vistaPersonaje.actualizarPosicion(-1,0);
            vistaPersonaje.actualizarImagen(new Image("https://imgur.com/npbSGMe.png"));
        }
        MovimientoIzquierda movIzquierda = new MovimientoIzquierda();
        Bloque unBloque = new Bloque(movIzquierda);
        this.unTablero.agregarBloque(unBloque);
    }
}
