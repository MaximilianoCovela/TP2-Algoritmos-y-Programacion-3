package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoArriba;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoIzquierda extends Boton {
    private HandlerBotonMovimientoIzquierda accion;
    private int index;

    public BotonMovimientoIzquierda(VBoxBotones vBoxBotones, Tablero unTablero,
                                 int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.index = index;
        this.accion = new HandlerBotonMovimientoIzquierda(vBoxBotones,
                unTablero, this,index, vbd, listaDeVBox);
        this.setOnAction(accion);
    }

    public int getIndex() {
        return index;
    }

    public Button getButton() {
        return this;
    }

    public void setIndex(int i){
        this.index = i;
    }

}
