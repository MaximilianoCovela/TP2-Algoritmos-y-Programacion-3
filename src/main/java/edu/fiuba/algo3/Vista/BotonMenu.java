package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMenu;

import javafx.scene.control.Button;


public class BotonMenu extends Button {

    private HandlerBotonMenu accion;

    public BotonMenu(){
        super();
        this.setText("Menú");
        this.setLayoutX(776.0);
        this.setLayoutY(538.0);
        this.accion = new HandlerBotonMenu();
        this.setOnAction(accion);
    }

}
