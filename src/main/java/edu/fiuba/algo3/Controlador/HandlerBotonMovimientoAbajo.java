package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoAbajo;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import  edu.fiuba.algo3.modelo.Bloque;

import java.util.ArrayList;

public class HandlerBotonMovimientoAbajo implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoAbajo unBotonAbajo;
    private int index;
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoAbajo(VboxBotonesSeleccionados vbox,
                                       Tablero unTablero, BotonMovimientoAbajo botonAbajo, int index,
                                       VboxBotonesDisponibles vboxdisponibles, ArrayList listaDeVBox){
        this.vboxbotonesseleccionados = vbox;
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
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonAbajo)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();

            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo(this.vboxbotonesseleccionados,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            this.vboxbotonesseleccionados.getChildren().add(botonAbajo);
            MovimientoAbajo movAbajo = new MovimientoAbajo();
            Bloque unBloque = new Bloque(movAbajo);
            this.unTablero.agregarBloque(unBloque);
            System.out.println("indice:"+ index);

        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonAbajo);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}
