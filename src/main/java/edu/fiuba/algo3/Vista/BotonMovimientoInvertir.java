package edu.fiuba.algo3.Vista;


import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoInvertir;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoInvertir extends Button {

    public BotonMovimientoInvertir(VBoxBotones vBoxBotones, Tablero unTablero,
                                        int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Invertir");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoInvertir(vBoxBotones, unTablero, this,
                index, vbd, listaDeVBox));
    }
}
