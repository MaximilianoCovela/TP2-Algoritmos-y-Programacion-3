package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class HandlerBotonMovimientoDerecha implements EventHandler<ActionEvent>{

    private  VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoDerecha unBotonDerecha;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoDerecha(VBoxBotones vbox,
                                         Tablero unTablero, BotonMovimientoDerecha botonDerecha, int index,
                                         VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonDerecha = botonDerecha;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }


    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        if(!this.vBoxBotones.getChildren().contains(this.unBotonDerecha)){
            MovimientoDerecha movDerecha = new MovimientoDerecha();

            actualVBox.guardarMovimiento(movDerecha);
            this.index = (actualVBox.getChildren().size());
            System.out.println("Indice del objeto: "+ this.index);
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonDerecha);



        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonDerecha);
        }
        vboxBotonesDisponibles.verificar();
    }
}
