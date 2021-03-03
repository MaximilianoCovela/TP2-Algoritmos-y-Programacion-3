package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoPersonalizado;
import edu.fiuba.algo3.Vista.VBoxBotones;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoPersonalizado implements EventHandler<ActionEvent>{

    private VBoxBotones vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoPersonalizado unBotonPersonalizado;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private int index;
    private String nombre;
    private MovimientoPersonalizado unMovimientoPersonalizado;
    private ArrayList<VBoxBotones> listaDeVbox;

    public HandlerBotonMovimientoPersonalizado(VBoxBotones vbox,
                                               Tablero unTablero, BotonMovimientoPersonalizado botonPersonalizado,
                                               int index, VboxBotonesDisponibles vboxdisponibles, String nombre,
                                               MovimientoPersonalizado unMovPersonalizado,
                                               ArrayList<VBoxBotones> listaDeVbox){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.index = index;
        this. unBotonPersonalizado = botonPersonalizado;
        this.nombre = nombre;
        this.unMovimientoPersonalizado = unMovPersonalizado;
        this.listaDeVbox = listaDeVbox;
    }

    public void handle(ActionEvent event) {

        VBoxBotones vBoxActual = this.listaDeVbox.get(listaDeVbox.size()-1);

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonPersonalizado)){
            this.index = (vBoxActual.getChildren()).size();


            vBoxActual.guardarMovimiento(unMovimientoPersonalizado);
            this.index = (vBoxActual.getChildren().size()); // esto lo agregue recien
            BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado(vBoxActual,
                    this.unTablero,this.index, this.vboxBotonesDisponibles, this.nombre, this.unMovimientoPersonalizado,
                    this.listaDeVbox);
            vBoxActual.getChildren().add(botonPersonalizado);

        }else{
            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(this.unBotonPersonalizado); // estoy cambiando

        }
        vboxBotonesDisponibles.verificar();
    }
}
