package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoLapizAbajo;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoLapizAbajo extends Boton {

    private HandlerBotonMovimientoLapizAbajo accion;
    private int index;


    public BotonMovimientoLapizAbajo(VBoxBotones vboxbotonesseleccionados,
                                     Tablero unTablero, int index, VboxBotonesDisponibles vbd, ArrayList<VBoxBotones> listaDeVBox){

        super();
        this.setText("Lapiz Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.index = index;
        this.accion = new HandlerBotonMovimientoLapizAbajo(vboxbotonesseleccionados,
                unTablero, this, index, vbd, listaDeVBox);
        this.setOnAction(accion);
    }


    public int getIndex() {
        return this.index;
    }

    public Button getButton() {
        return this;
    }

    public void setIndex(int i){
        this.index = i;
    }
}
