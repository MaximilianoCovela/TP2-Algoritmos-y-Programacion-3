package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonGuardarAlgoritmo;
import javafx.scene.control.Button;

public class BotonGuardarAlgoritmo extends Button {

    public BotonGuardarAlgoritmo() {
        super();
        this.setText("Guardar algoritmo");
        this.setLayoutX(766);
        this.setLayoutY(555.0);
        this.setOnAction(new HandlerBotonGuardarAlgoritmo());
    }

}
