package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import javafx.scene.control.Button;

public class BotonMovimientoArriba extends Button {

    public BotonMovimientoArriba(PersonajeView unaVistaPersonaje){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoArriba(unaVistaPersonaje));
    }

    public BotonMovimientoArriba(VboxBotonesSeleccionados vboxbotonesseleccionados, PersonajeView unaVistaPersonaje){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoArriba(vboxbotonesseleccionados, unaVistaPersonaje));
    }
}
