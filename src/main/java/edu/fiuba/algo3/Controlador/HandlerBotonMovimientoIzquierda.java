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
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoIzquierda(VBoxBotones vbox,Tablero unTablero,
                                           BotonMovimientoIzquierda botonIzquierda, int index,
                                           VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
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

            VBoxBotones primerVBox = this.listaDeVBox.get(0); // es bloques seleccionados

            VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonIzquierda);

                Bloque unBloque = new Bloque(movIzquierda);
                this.unTablero.agregarBloque(unBloque);
                return;

            }
            /*
            actualVBox.guardarMovimiento(movIzquierda);
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonIzquierda);
            */

            actualVBox.guardarMovimiento(movIzquierda);
            this.index = (actualVBox.getChildren().size());
            System.out.println("Indice del objeto: "+ this.index);
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonIzquierda);


        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonIzquierda);
        }
        vboxBotonesDisponibles.verificar();
    }
}
