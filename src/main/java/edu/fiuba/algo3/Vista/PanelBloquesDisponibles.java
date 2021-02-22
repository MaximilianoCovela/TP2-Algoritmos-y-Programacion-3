package edu.fiuba.algo3.Vista;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class PanelBloquesDisponibles extends ScrollPane {

    public PanelBloquesDisponibles(VBox panelBloquesDisponibles){
        this.setLayoutX(530.0);
        this.setLayoutY(48.0);
        this.setMaxSize(172, 438);
        this.setContent(panelBloquesDisponibles);


    }
}
