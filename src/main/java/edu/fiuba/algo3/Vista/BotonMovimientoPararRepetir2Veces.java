package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPararRepetir2Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoPararRepetir2Veces extends Button {

    private HandlerBotonMovimientoPararRepetir2Veces accion;

    public BotonMovimientoPararRepetir2Veces(VBoxBotones vBoxBotones,
                                      Tablero unTablero, int index, ArrayList listaDeVBox){
        super();
        this.setText("Parar (Repetir x2)");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoPararRepetir2Veces(vBoxBotones,
                unTablero, this, index, listaDeVBox);
        this.setOnAction(accion);
    }

}
