package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoAbajo extends Button {

    private HandlerBotonMovimientoAbajo accion;

    public BotonMovimientoAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero,
                                int index, VboxBotonesDisponibles vboxbotonesdisponibles, ArrayList listaDeVBox){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(vboxbotonesseleccionados,
                unTablero, this, index, vboxbotonesdisponibles, listaDeVBox);
        this.setOnAction(accion);
    }

}
