package edu.fiuba.algo3.Vista;


import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoDerecha extends Boton{
    private HandlerBotonMovimientoDerecha accion;
    private int index;

    public BotonMovimientoDerecha(VBoxBotones vBoxBotones, Tablero unTablero,
                                 int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Derecha");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.index = index;
        this.accion = new HandlerBotonMovimientoDerecha(vBoxBotones,
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
