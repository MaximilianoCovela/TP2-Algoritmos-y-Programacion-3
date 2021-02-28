package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPararInvertir;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPararRepetir3Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoPararInvertir extends Button {

    private HandlerBotonMovimientoPararInvertir accion;

    public BotonMovimientoPararInvertir(VBoxBotones vBoxBotones,
                                             Tablero unTablero, int index, ArrayList<VBoxBotones> listaDeVBox){
        super();
        this.setText("Parar Invertir");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoPararInvertir(vBoxBotones,
                unTablero, this, index, listaDeVBox);
        this.setOnAction(accion);
    }

}
