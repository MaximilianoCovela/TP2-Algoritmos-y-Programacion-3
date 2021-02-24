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

    public HandlerBotonMovimientoAbajo(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                       Tablero unTablero){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }

    public HandlerBotonMovimientoAbajo(PersonajeView unaVistaPersonaje, Tablero unTablero){
        this.vboxbotonesseleccionados = null;
        this.unTablero = unTablero;
        this.vistaPersonaje = unaVistaPersonaje;
    }

    public void mover(){
        vistaPersonaje.actualizarPosicion(0,1);
        vistaPersonaje.actualizarImagen(new Image("https://i.imgur.com/rcT26Fo.png"));

    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            this.vboxbotonesseleccionados.getChildren().add(new BotonMovimientoAbajo(this.vistaPersonaje,
                    this.unTablero));
        }else{
            // aca hacemos lo de moverse, hardcodeado
            //vistaPersonaje.actualizarPosicion(0,1);
            //vistaPersonaje.actualizarImagen(new Image("https://i.imgur.com/rcT26Fo.png"));
        }
        System.out.println("handle btn Abajo");
        MovimientoAbajo movAbajo = new MovimientoAbajo();
        Bloque unBloque = new Bloque(movAbajo);
        this.unTablero.agregarBloque(unBloque);

    }
}
