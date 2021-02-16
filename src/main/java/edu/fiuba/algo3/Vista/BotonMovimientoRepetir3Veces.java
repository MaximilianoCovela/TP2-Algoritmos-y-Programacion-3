package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir3Veces;
import javafx.scene.control.Button;

public class BotonMovimientoRepetir3Veces extends Button {

    public BotonMovimientoRepetir3Veces(){
        super();
        this.setText("Repetir3Veces");
        this.setMinHeight(20);
        this.setOnAction(new HandlerBotonMovimientoRepetir3Veces());
    }
}
