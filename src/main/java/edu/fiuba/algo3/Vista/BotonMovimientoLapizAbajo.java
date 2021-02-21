package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizAbajo;

import javafx.scene.control.Button;

public class BotonMovimientoLapizAbajo extends Button {

    public BotonMovimientoLapizAbajo(VboxBotonesSeleccionados vboxbotonesseleccionados){
        super();
        this.setText("Lapiz Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoLapizAbajo(vboxbotonesseleccionados));
    }

    public BotonMovimientoLapizAbajo(){
        super();
        this.setText("Lapiz Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoLapizAbajo());
    }

}
