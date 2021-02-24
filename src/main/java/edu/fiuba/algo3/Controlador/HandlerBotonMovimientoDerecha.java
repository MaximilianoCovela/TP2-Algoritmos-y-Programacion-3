package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class HandlerBotonMovimientoDerecha implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;
    private Tablero unTablero;

    public HandlerBotonMovimientoDerecha(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                         Tablero unTablero){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }

    public HandlerBotonMovimientoDerecha(PersonajeView unaVistaPersonaje, Tablero unTablero){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }

    public void mover(){
        vistaPersonaje.actualizarPosicion(1,0);
        vistaPersonaje.actualizarImagen(new Image("https://imgur.com/awfzRqc.png"));

    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(this.vistaPersonaje,
                    this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonDerecha);
        }else{
            vistaPersonaje.actualizarPosicion(1,0);
            vistaPersonaje.actualizarImagen(new Image("https://imgur.com/awfzRqc.png"));
        }
        MovimientoDerecha movDerecha = new MovimientoDerecha();
        Bloque unBloque = new Bloque(movDerecha);
        this.unTablero.agregarBloque(unBloque);
    }
}
