package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonJugar;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Tablero;

public class BotonJugar extends Button {

    public BotonJugar(Tablero unTablero){
        this.setText("Ejecutar");
        this.setLayoutX(118.0);
        this.setLayoutY(555.0);
        this.prefHeight(25.0);
        this.prefWidth(61.0);
        this.setOnAction(new HandlerBotonJugar(unTablero));

    }

}
