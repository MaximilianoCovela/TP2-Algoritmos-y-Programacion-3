package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir2Veces;
import javafx.scene.control.Button;

public class BotonMovimientoRepetir2Veces extends Button {

    public BotonMovimientoRepetir2Veces(){
        super();
        this.setText("Repetir2Veces");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoRepetir2Veces());
    }
}
