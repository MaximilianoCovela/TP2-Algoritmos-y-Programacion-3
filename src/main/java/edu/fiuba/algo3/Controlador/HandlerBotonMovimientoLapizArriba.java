package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizAbajo;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoLapizArriba implements EventHandler<ActionEvent>{

    private VBoxBotones vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoLapizArriba unBotonLapizArriba;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonMovimientoLapizArriba(VBoxBotones vbox,Tablero unTablero,
                                             BotonMovimientoLapizArriba botonLapizArriba, int index,
                                             VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonLapizArriba = botonLapizArriba;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizArriba)){

            MovimientoLapizArriba movimientoLapizArriba = new MovimientoLapizArriba();

            actualVBox.guardarMovimiento(movimientoLapizArriba);
            this.index = (actualVBox.getChildren().size());

            BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba(actualVBox ,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonLapizArriba);

        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonLapizArriba);
        }
        vboxBotonesDisponibles.verificar();
    }


}
