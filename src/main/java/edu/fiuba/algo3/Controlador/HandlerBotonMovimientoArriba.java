
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoArriba;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;

import java.util.ArrayList;


public class HandlerBotonMovimientoArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoArriba unBotonArriba;
    private int index;
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoArriba(VboxBotonesSeleccionados vbox,
                                        Tablero unTablero, BotonMovimientoArriba botonArriba,int index,
                                        VboxBotonesDisponibles vboxdisponibles, ArrayList listaDeVBox){
        this.vboxbotonesseleccionados = vbox;
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

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonArriba)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba(this.vboxbotonesseleccionados,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

            this.vboxbotonesseleccionados.getChildren().add(botonArriba);
            MovimientoArriba movArriba = new MovimientoArriba();
            Bloque unBloque = new Bloque(movArriba);
            this.unTablero.agregarBloque(unBloque);
            System.out.println("indice:"+ index);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonArriba);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}