package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoLapizArriba extends Button {

    public BotonMovimientoLapizArriba(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero){
        super();
        this.setText("Lapiz Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoLapizArriba(vboxbotonesseleccionados));
    }

    public BotonMovimientoLapizArriba(){
        super();
        this.setText("Lapiz Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoLapizArriba());
    }

}
