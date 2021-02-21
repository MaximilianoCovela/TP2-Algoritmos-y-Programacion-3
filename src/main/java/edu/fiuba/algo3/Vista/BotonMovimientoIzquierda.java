package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoIzquierda;
import javafx.scene.control.Button;

public class BotonMovimientoIzquierda extends Button {

    public BotonMovimientoIzquierda(VboxBotonesSeleccionados vboxbotonesseleccionados){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoIzquierda(vboxbotonesseleccionados));
    }

    public BotonMovimientoIzquierda(){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoIzquierda());
    }
}
