package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoDerecha;
import javafx.scene.control.Button;

public class BotonMovimientoDerecha extends Button {

    public BotonMovimientoDerecha(){
        super();
        this.setText("Derecha");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoDerecha());
    }
}
