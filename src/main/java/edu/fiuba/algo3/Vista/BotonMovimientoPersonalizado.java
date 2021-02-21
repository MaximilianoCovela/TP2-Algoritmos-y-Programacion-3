package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPersonalizado;
import javafx.scene.control.Button;

public class BotonMovimientoPersonalizado extends Button {

    public BotonMovimientoPersonalizado(VboxBotonesSeleccionados vboxbotonesseleccionados){
        super();
        this.setText("Personalizado");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoPersonalizado(vboxbotonesseleccionados));
    }

    public BotonMovimientoPersonalizado(){
        super();
        this.setText("Personalizado");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoPersonalizado());
    }
}
