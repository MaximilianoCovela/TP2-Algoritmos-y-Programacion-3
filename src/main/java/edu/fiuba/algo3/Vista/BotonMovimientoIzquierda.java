package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoIzquierda extends Button implements Boton {
    private HandlerBotonMovimientoIzquierda accion;

    public BotonMovimientoIzquierda(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                    PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoIzquierda(vboxbotonesseleccionados, unaVistaPersonaje,
                unTablero));
    }

    public BotonMovimientoIzquierda(PersonajeView unaVistaPersonaje, Tablero unTablero){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoIzquierda( unaVistaPersonaje, unTablero);
        this.setOnAction(accion);
    }

    public void ejecutarAccion(PersonajeView unaVistaPersonaje) {
        accion.mover();

    }
}
