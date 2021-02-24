package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonReiniciar implements EventHandler<ActionEvent>{

    private Tablero unTablero;
    private VboxBotonesSeleccionados vboxBotones;
    private PersonajeView vistaPersonaje;

    public HandlerBotonReiniciar(Tablero unTablero, VboxBotonesSeleccionados vboxBotonesSeleccionados, PersonajeView vistaPersonaje){
        this.unTablero = unTablero;
        this.vboxBotones = vboxBotonesSeleccionados;
        this.vistaPersonaje = vistaPersonaje;

    }

    public void handle(ActionEvent event) {
        //System.out.println("Reiniciar");
        vboxBotones.vaciarBotonesSeleccionados();
        unTablero.reiniciarTablero();
        vistaPersonaje.reiniciarVistaPersonaje();
    }

}
