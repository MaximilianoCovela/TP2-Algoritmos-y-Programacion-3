package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoAbajo extends Boton {

    private HandlerBotonMovimientoAbajo accion;
    private int index;

    public BotonMovimientoAbajo(VBoxBotones vBoxBotones, Tablero unTablero,
                                int index, VboxBotonesDisponibles vboxbotonesdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(vBoxBotones,
                unTablero, this, index, vboxbotonesdisponibles, listaDeVBox );
        this.index = index;
        this.setOnAction(accion);
    }

    public int getIndex(){

        return index;

    }

    public Button getButton(){
        return this;
    }


    public void setIndex(int i){

        this.index = i;
    }

}
