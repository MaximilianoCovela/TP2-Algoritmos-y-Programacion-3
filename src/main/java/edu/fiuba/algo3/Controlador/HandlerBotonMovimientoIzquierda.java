package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoIzquierda;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoDerecha;
import edu.fiuba.algo3.modelo.MovimientoIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class HandlerBotonMovimientoIzquierda implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoIzquierda unBotonIzquierda;
    private int index;

    public HandlerBotonMovimientoIzquierda(VboxBotonesSeleccionados vbox,Tablero unTablero,
                                           BotonMovimientoIzquierda botonIzquierda, int index,
                                           VboxBotonesDisponibles vboxdisponibles){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonIzquierda = botonIzquierda;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonIzquierda)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda(this.vboxbotonesseleccionados,
                    this.unTablero,this.index, this.vboxBotonesDisponibles);

            this.vboxbotonesseleccionados.getChildren().add(botonIzquierda);
            MovimientoIzquierda movIzquierda = new MovimientoIzquierda();
            Bloque unBloque = new Bloque(movIzquierda);
            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonIzquierda);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }
}
