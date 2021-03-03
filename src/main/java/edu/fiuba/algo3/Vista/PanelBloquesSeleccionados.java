package edu.fiuba.algo3.Vista;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class PanelBloquesSeleccionados extends ScrollPane {

    VboxBotonesSeleccionados bloquesSeleccionados;

    public PanelBloquesSeleccionados(VboxBotonesSeleccionados bloquesSeleccionados){
        this.setLayoutX(713.0);
        this.setLayoutY(48.0);
        this.setMaxSize(172, 438);
        this.setContent(bloquesSeleccionados);
        this.bloquesSeleccionados = bloquesSeleccionados;
    }

    public VboxBotonesSeleccionados obtenerVBoxBotones(){

        return this.bloquesSeleccionados;

    }

}
