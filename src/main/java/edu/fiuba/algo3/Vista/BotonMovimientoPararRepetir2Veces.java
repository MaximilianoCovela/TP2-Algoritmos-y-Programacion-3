package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPararRepetir2Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonMovimientoPararRepetir2Veces extends Button {

    private HandlerBotonMovimientoPararRepetir2Veces accion;

    public BotonMovimientoPararRepetir2Veces(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                      Tablero unTablero, int index){
        super();
        this.setText("Parar (Repetir x2)");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoPararRepetir2Veces(vboxbotonesseleccionados,
                unTablero, this, index);
        this.setOnAction(accion);
    }

}
