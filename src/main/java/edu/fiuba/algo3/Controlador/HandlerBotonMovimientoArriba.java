
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

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

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vBoxBotones.getChildren().contains(this.unBotonArriba)){
            MovimientoArriba movArriba = new MovimientoArriba();

            VBoxBotones primerVBox = this.listaDeVBox.get(0); // es bloques seleccionados

            VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonArriba);

                Bloque unBloque = new Bloque(movArriba);
                this.unTablero.agregarBloque(unBloque);
                return;

            }

            actualVBox.guardarMovimiento(movArriba);
            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonArriba);

        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonArriba);
        }
        vboxBotonesDisponibles.verificar();
    }
}