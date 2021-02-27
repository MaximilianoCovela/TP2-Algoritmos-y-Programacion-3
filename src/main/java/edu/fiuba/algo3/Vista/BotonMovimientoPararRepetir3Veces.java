package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPararRepetir3Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoPararRepetir3Veces extends Button {

    private HandlerBotonMovimientoPararRepetir3Veces accion;

    public BotonMovimientoPararRepetir3Veces(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                             Tablero unTablero, int index){
        super();
        this.setText("Parar (Repetir x3)");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoPararRepetir3Veces(vboxbotonesseleccionados,
                unTablero, this, index);
        this.setOnAction(accion);
    }
}
