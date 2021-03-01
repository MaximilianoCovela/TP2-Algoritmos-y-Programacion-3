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

    private Boton botonSeleccionado;
    private VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoAbajo unBotonAbajo;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoAbajo(VBoxBotones vBoxBotones,
                                       Tablero unTablero, BotonMovimientoAbajo botonAbajo, int index,
                                       VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox,
                                       Boton botonSeleccionado){

        this.vBoxBotones = vBoxBotones;
        this.unTablero = unTablero;
        this.unBotonAbajo = botonAbajo;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
        this.botonSeleccionado = botonSeleccionado;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        VBoxBotones primerVBox = this.listaDeVBox.get(0); // es bloques seleccionados

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        if(!this.vBoxBotones.getChildren().contains(this.unBotonAbajo)){ //quizas n haga falta

            MovimientoAbajo movAbajo = new MovimientoAbajo();

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox,  botonSeleccionado);

                primerVBox.getChildren().add(botonAbajo);

                //tablero
                Bloque unBloque = new Bloque(movAbajo);
                this.unTablero.agregarBloque(unBloque);
                return;

            }
             //agregue esto, se borra lo de la posc 0

            actualVBox.guardarMovimiento(movAbajo);
            this.index = (actualVBox.getChildren().size());
            System.out.println("Indice del objeto: "+ this.index);
            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox, botonSeleccionado);
            actualVBox.getChildren().add(botonAbajo);


        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonAbajo);
        }
        vboxBotonesDisponibles.verificar();
    }
}
