package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoAbajo extends Button {

    private HandlerBotonMovimientoAbajo accion;

    public BotonMovimientoAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero,
                                int index, VboxBotonesDisponibles vboxbotonesdisponibles){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(vboxbotonesseleccionados,
                unTablero, this, index, vboxbotonesdisponibles);
        this.setOnAction(accion);
    }

}
