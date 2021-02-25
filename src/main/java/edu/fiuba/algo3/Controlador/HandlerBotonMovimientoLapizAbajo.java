package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoLapizAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizAbajo implements EventHandler<ActionEvent>{

    private final PersonajeView vistaPersonaje;
    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoLapizAbajo unBotonLapizAbajo;

    public HandlerBotonMovimientoLapizAbajo(VboxBotonesSeleccionados vbox, PersonajeView unaVistaPersonaje,
                                        Tablero unTablero, BotonMovimientoLapizAbajo botonLapizAbajo){
        this.vboxbotonesseleccionados = vbox;
        this.vistaPersonaje = unaVistaPersonaje;
        this.unTablero = unTablero;
        this.unBotonLapizAbajo = botonLapizAbajo;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizAbajo)){
            BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo(this.vboxbotonesseleccionados,
                    this.vistaPersonaje, this.unTablero);
            this.vboxbotonesseleccionados.getChildren().add(botonLapizAbajo);
            System.out.println("handle btn lapiz Abajo");

            MovimientoLapizAbajo movimientoLapizAbajo = new MovimientoLapizAbajo();
            Bloque unBloque = new Bloque(movimientoLapizAbajo);

            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonLapizAbajo);
        }
    }

}
