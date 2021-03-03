package edu.fiuba.algo3.Vista;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class PanelBloquesDisponibles extends ScrollPane {

    private VboxBotonesDisponibles vboxBotonesDisponibles;

    public PanelBloquesDisponibles(VboxBotonesDisponibles panelBloquesDisponibles){
        this.setLayoutX(505.0);
        this.setLayoutY(48.0);
        this.setMaxSize(172, 438);
        this.setContent(panelBloquesDisponibles);
        this.vboxBotonesDisponibles = panelBloquesDisponibles;
    }

    public VboxBotonesDisponibles obtenerVBox(){
        return this.vboxBotonesDisponibles;
    }
}
