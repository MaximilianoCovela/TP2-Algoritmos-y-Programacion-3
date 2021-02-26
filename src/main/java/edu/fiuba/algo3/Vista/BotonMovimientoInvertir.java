package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoInvertir;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoInvertir extends Button {

    public BotonMovimientoInvertir(){
        super();
        this.setText("Invertir");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoInvertir());
    }

    public BotonMovimientoInvertir(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero){
        super();
        this.setText("Invertir");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoInvertir(vboxbotonesseleccionados));
    }
}
