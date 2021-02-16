package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import javafx.scene.control.Button;

public class BotonMovimientoArriba extends Button {

    public BotonMovimientoArriba(){
        super();
        this.setText("Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoArriba());
    }
}
