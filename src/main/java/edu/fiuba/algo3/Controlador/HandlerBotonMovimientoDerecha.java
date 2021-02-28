package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
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
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoDerecha(VBoxBotones vbox,
                                         Tablero unTablero, BotonMovimientoDerecha botonDerecha, int index,
                                         VboxBotonesDisponibles vboxdisponibles, ArrayList listaDeVBox){
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
        if(!this.vBoxBotones.getChildren().contains(this.unBotonDerecha)){
            MovimientoDerecha movDerecha = new MovimientoDerecha();

            VBoxBotones primerVBox = (VBoxBotones) this.listaDeVBox.get(0); // es bloques seleccionados

            VBoxBotones actualVBox = (VBoxBotones) this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

            if(this.listaDeVBox.size() == 1){

                this.index = (this.vBoxBotones.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonDerecha);

                //tablero
                Bloque unBloque = new Bloque(movDerecha);
                this.unTablero.agregarBloque(unBloque);
                return;

            }


            actualVBox.guardarMovimiento(movDerecha);
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonDerecha);

            System.out.println("indice:"+ index);

        }else{
            this.vBoxBotones.getChildren().remove(this.unBotonDerecha);
            this.vBoxBotones.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}
