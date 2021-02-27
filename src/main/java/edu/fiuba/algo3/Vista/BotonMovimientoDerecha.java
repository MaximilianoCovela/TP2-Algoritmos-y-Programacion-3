package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoDerecha extends Button{
    private HandlerBotonMovimientoDerecha accion;

    public BotonMovimientoDerecha(VBoxBotones vBoxBotones,
                                  Tablero unTablero, int index, VboxBotonesDisponibles vbd, ArrayList listaDeVBox){
        super();
        this.setText("Derecha");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoDerecha(vBoxBotones,
                unTablero, this, index, vbd, listaDeVBox);
        this.setOnAction(accion);
    }

}
