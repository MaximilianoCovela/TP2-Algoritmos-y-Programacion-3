
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

    public HandlerBotonMovimientoArriba(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                        Tablero unTablero){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }
    public void mover(){
        vistaPersonaje.actualizarPosicion(0,-1);
        vistaPersonaje.actualizarImagen(new Image("https://imgur.com/N3gBRlL.png"));

    }
    public HandlerBotonMovimientoArriba(PersonajeView unaVistaPersonaje, Tablero unTablero){
        this.vboxbotonesseleccionados = null;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
    }


    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            this.vboxbotonesseleccionados.getChildren().add(new BotonMovimientoArriba(this.vistaPersonaje,
                    this.unTablero));
        }else{
            vistaPersonaje.actualizarPosicion(0,-1);
            vistaPersonaje.actualizarImagen(new Image("https://imgur.com/N3gBRlL.png"));
        }
        MovimientoArriba movArriba = new MovimientoArriba();
        Bloque unBloque = new Bloque(movArriba);
        this.unTablero.agregarBloque(unBloque);
    }
}