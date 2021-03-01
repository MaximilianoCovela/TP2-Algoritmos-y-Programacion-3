package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoLapizAbajo implements EventHandler<ActionEvent>{

    private VBoxBotones vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoLapizAbajo unBotonLapizAbajo;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonMovimientoLapizAbajo(VBoxBotones vbox,Tablero unTablero,
                                            BotonMovimientoLapizAbajo botonLapizAbajo, int index,
                                            VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonLapizAbajo = botonLapizAbajo;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        VBoxBotones primerVBox = this.listaDeVBox.get(0); // es bloques seleccionados

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizAbajo)){

            MovimientoLapizAbajo movimientoLapizAbajo = new MovimientoLapizAbajo();

            if(this.listaDeVBox.size() == 1){

                this.index = (actualVBox.getChildren()).size(); // le estamos mandando la vbox de seleccionados
                BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo(primerVBox ,
                        this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);

                primerVBox.getChildren().add(botonLapizAbajo);

                Bloque unBloque = new Bloque(movimientoLapizAbajo);
                this.unTablero.agregarBloque(unBloque);
                return;

            }
            /*
            actualVBox.guardarMovimiento(movIzquierda);
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(actualVBox,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonIzquierda);
            */

            actualVBox.guardarMovimiento(movimientoLapizAbajo);
            this.index = (actualVBox.getChildren().size());

            BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo(primerVBox ,
                    this.unTablero, this.index, this.vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(botonLapizAbajo);


        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonLapizAbajo);
        }
        vboxBotonesDisponibles.verificar();
    }

}
