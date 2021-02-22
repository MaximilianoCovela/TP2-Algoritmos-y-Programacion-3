package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonReiniciar;
import javafx.scene.control.Button;

public class BotonReiniciar extends Button {

    public BotonReiniciar(){
        this.setText("Reiniciar");
        this.setLayoutX(302.0);
        this.setLayoutY(555.0);
        this.setOnAction(new HandlerBotonReiniciar());


    }

}
