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
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoAbajo(VBoxBotones vBoxBotones,
                                       Tablero unTablero, BotonMovimientoAbajo botonAbajo, int index,
                                       VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){

        this.vBoxBotones = vBoxBotones;
        this.unTablero = unTablero;
        this.unBotonAbajo = botonAbajo;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonAbajo)){

            MovimientoAbajo movAbajo = new MovimientoAbajo();

            actualVBox.guardarMovimiento(movAbajo);
            this.index = (actualVBox.getChildren().size());

            this.unBotonAbajo.setIndex(this.index);

            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonAbajo);


        }else{

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonAbajo);

        }
        vboxBotonesDisponibles.verificar();
    }
}
