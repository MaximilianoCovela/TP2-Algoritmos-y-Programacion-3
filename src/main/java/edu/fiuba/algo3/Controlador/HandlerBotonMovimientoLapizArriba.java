package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizAbajo;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizArriba implements EventHandler<ActionEvent>{

    private final PersonajeView vistaPersonaje;
    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoLapizArriba unBotonLapizArriba;

    public HandlerBotonMovimientoLapizArriba(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                            Tablero unTablero, BotonMovimientoLapizArriba botonLapizAbajo){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonLapizArriba = botonLapizAbajo;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizArriba)){
            BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonLapizArriba);

            MovimientoLapizArriba movimientoLapizArriba = new MovimientoLapizArriba();
            Bloque unBloque = new Bloque(movimientoLapizArriba);

            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonLapizArriba);
        }
    }


}
