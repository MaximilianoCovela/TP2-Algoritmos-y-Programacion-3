package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPersonalizado;
import javafx.scene.control.Button;

public class BotonMovimientoPersonalizado extends Button {

    public BotonMovimientoPersonalizado(){
        super();
        this.setText("Personalizado");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoPersonalizado());
    }
}
