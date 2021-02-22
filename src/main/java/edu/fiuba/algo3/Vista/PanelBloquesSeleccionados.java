package edu.fiuba.algo3.Vista;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class PanelBloquesSeleccionados extends ScrollPane {

    public PanelBloquesSeleccionados(VBox bloquesSeleccionados){
        this.setLayoutX(738.0);
        this.setLayoutY(48.0);
        this.setMaxSize(172, 438);
        this.setContent(bloquesSeleccionados);

    }

}
