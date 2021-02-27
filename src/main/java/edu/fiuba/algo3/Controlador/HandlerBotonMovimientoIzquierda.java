package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class HandlerBotonMovimientoIzquierda implements EventHandler<ActionEvent>{

    private final VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoIzquierda unBotonIzquierda;
    private int index;
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoIzquierda(VBoxBotones vbox,Tablero unTablero,
                                           BotonMovimientoIzquierda botonIzquierda, int index,
                                           VboxBotonesDisponibles vboxdisponibles, ArrayList listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonIzquierda = botonIzquierda;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vBoxBotones.getChildren().contains(this.unBotonIzquierda)){

            MovimientoIzquierda movIzquierda = new MovimientoIzquierda();

            VBoxBotones primerVBox = (VBoxBotones) this.listaDeVBox.get(0); // es bloques seleccionados

            VBoxBotones actualVBox = (VBoxBotones) this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonIzquierda);

                //tablero
                Bloque unBloque = new Bloque(movIzquierda);
                this.unTablero.agregarBloque(unBloque);
                return;

            }

            VBoxBotones vbox;
            vbox = (VBoxMovimientoRepetir2Veces) this.listaDeVBox.get(listaDeVBox.size()-1);
            vbox.guardarMovimiento(movIzquierda);
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(vbox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            vbox.getChildren().add(botonIzquierda);

            System.out.println("indice:"+ index);

        }else{
            this.vBoxBotones.getChildren().remove(this.unBotonIzquierda);
            this.vBoxBotones.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}
