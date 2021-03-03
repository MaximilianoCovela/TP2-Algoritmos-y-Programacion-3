package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoArriba extends Boton {
    private HandlerBotonMovimientoArriba accion;
    private int index;

    public BotonMovimientoArriba(VBoxBotones vBoxBotones, Tablero unTablero,
                                 int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Arriba");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.index = index;
        this.accion = new HandlerBotonMovimientoArriba(vBoxBotones,
                unTablero, this,index, vbd, listaDeVBox);
        this.setOnAction(accion);
    }

    public int getIndex() {
        return index;
    }


    public Button getButton() {
        return this;
    }

    public String getNombre() {
        return "UWU";
    }

    public void setIndex(int i){

        this.index = i;

    }
}
