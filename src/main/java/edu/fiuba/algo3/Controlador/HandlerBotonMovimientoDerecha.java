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
    private BotonMovimientoDerecha unBotonDerecha;

    public HandlerBotonMovimientoDerecha(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                         Tablero unTablero, BotonMovimientoDerecha botonDerecha){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonDerecha = botonDerecha;
    }



    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonDerecha)){
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonDerecha);
            MovimientoDerecha movDerecha = new MovimientoDerecha();
            Bloque unBloque = new Bloque(movDerecha);
            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonDerecha);
        }
    }
}
