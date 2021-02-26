package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.BotonMovimientoPersonalizado;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoPersonalizado implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoPersonalizado unBotonPersonalizado;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private int index;
    private String nombre;
    private MovimientoPersonalizado unMovimientoPersonalizado;

    public HandlerBotonMovimientoPersonalizado(VboxBotonesSeleccionados vbox,
                                               Tablero unTablero, BotonMovimientoPersonalizado botonPersonalizado,
                                               int index, VboxBotonesDisponibles vboxdisponibles, String nombre,
                                               MovimientoPersonalizado unMovPersonalizado){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.index = index;
        this. unBotonPersonalizado = botonPersonalizado;
        this.nombre = nombre;
        this.unMovimientoPersonalizado = unMovPersonalizado;
    }

    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonPersonalizado)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado(this.vboxbotonesseleccionados,
                    this.unTablero,this.index, this.vboxBotonesDisponibles, this.nombre, this.unMovimientoPersonalizado);
            Bloque unBloque = new Bloque(unMovimientoPersonalizado);
            this.unTablero.agregarBloque(unBloque);
            this.vboxbotonesseleccionados.getChildren().add(botonPersonalizado);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonPersonalizado);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}
