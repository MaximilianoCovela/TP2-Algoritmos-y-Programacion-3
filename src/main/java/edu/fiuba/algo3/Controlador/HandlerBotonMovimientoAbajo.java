package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import  edu.fiuba.algo3.modelo.Bloque;

import java.util.ArrayList;

public class HandlerBotonMovimientoAbajo implements EventHandler<ActionEvent>{

    private VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoAbajo unBotonAbajo;
    private int index;
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoAbajo(VBoxBotones vBoxBotones,
                                       Tablero unTablero, BotonMovimientoAbajo botonAbajo, int index,
                                       VboxBotonesDisponibles vboxdisponibles, ArrayList listaDeVBox){

        this.vBoxBotones = vBoxBotones;
        this.unTablero = unTablero;
        this.unBotonAbajo = botonAbajo;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {
        if(!this.vBoxBotones.getChildren().contains(this.unBotonAbajo)){

            MovimientoAbajo movAbajo = new MovimientoAbajo();

            VBoxBotones primerVBox = (VBoxBotones) this.listaDeVBox.get(0); // es bloques seleccionados

            VBoxBotones actualVBox = (VBoxBotones) this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonAbajo);

                //tablero
                Bloque unBloque = new Bloque(movAbajo);
                this.unTablero.agregarBloque(unBloque);
                return;

            }

            /*
            VBoxBotones vbox;
            vbox = (VBoxMovimientoRepetir2Veces) this.listaDeVBox.get(listaDeVBox.size()-1);
            */

            actualVBox.guardarMovimiento(movAbajo);
            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonAbajo);

            System.out.println("indice:"+ index);

        }else{
            System.out.println("Todavia no esta hecho esto padre :D");
            // vamos a tener que chequear esto, para que se borre de la vbox correspondiente
            /*
            this.vBoxBotones.getChildren().remove(this.unBotonAbajo);
            this.vBoxBotones.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
            */
        }
        vboxBotonesDisponibles.verificar();
    }
}
