package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir3Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoRepetir3Veces extends Button {

    public BotonMovimientoRepetir3Veces(VBoxBotones vBoxBotones, Tablero unTablero,
                                        int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Repetir x3");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoRepetir3Veces(vBoxBotones, unTablero, this,
                index, vbd, listaDeVBox));
    }
}
