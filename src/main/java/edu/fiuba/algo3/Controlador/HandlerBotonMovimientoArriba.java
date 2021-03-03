
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.MovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.util.ArrayList;


public class HandlerBotonMovimientoArriba implements EventHandler<ActionEvent>{

    private VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoArriba unBotonArriba;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonMovimientoArriba(VBoxBotones vbox,
                                        Tablero unTablero, BotonMovimientoArriba botonArriba,int index,
                                        VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonArriba = botonArriba;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }


    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonArriba)){
            MovimientoArriba movArriba = new MovimientoArriba();

            actualVBox.guardarMovimiento(movArriba);
            this.index = (actualVBox.getChildren().size());

            this.unBotonArriba.setIndex(this.index);

            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonArriba);


        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonArriba);
        }
        vboxBotonesDisponibles.verificar();
    }
}