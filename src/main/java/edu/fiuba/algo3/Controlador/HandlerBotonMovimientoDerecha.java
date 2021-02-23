package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class HandlerBotonMovimientoDerecha implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private final PersonajeView vistaPersonaje;

    public HandlerBotonMovimientoDerecha(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public HandlerBotonMovimientoDerecha(PersonajeView unaVistaPersonaje){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public void mover(){
        vistaPersonaje.actualizarPosicion(1,0);
        vistaPersonaje.actualizarImagen(new Image("https://imgur.com/N3gBRlL.png"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(this.vistaPersonaje);
            this.vboxbotonesseleccionados.getChildren().add(botonDerecha);
        }else{
            vistaPersonaje.actualizarPosicion(1,0);
            vistaPersonaje.actualizarImagen(new Image("https://imgur.com/awfzRqc.png"));
        }
    }
}
