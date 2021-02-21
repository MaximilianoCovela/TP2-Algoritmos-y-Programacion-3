package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonJugar;
import javafx.scene.control.Button;

public class BotonJugar extends Button {

    public BotonJugar(){
        this.setText("Ejecutar");
        this.setLayoutX(68.0);
        this.setLayoutY(510.0);
        this.prefHeight(25.0);
        this.prefWidth(61.0);
        this.setOnAction(new HandlerBotonJugar());
    }

}
