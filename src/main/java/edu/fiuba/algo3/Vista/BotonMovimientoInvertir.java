package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoInvertir;
import javafx.scene.control.Button;

public class BotonMovimientoInvertir extends Button {

    public BotonMovimientoInvertir(){
        super();
        this.setText("Invertir");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoInvertir());
    }
}
