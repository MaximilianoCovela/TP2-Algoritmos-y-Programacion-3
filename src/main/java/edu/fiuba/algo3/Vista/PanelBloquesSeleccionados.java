package edu.fiuba.algo3.Vista;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class PanelBloquesSeleccionados extends ScrollPane {

    public PanelBloquesSeleccionados(VBox bloquesSeleccionados){
        this.setLayoutX(618.0);
        this.setLayoutY(25.0);
        this.setMaxSize(172, 438);
        this.setContent(bloquesSeleccionados);
    }

}
