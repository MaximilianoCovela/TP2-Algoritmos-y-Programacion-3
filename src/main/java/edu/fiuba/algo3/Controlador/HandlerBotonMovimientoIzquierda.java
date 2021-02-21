package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoIzquierda;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoIzquierda implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoIzquierda(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoIzquierda(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoIzquierda botonIzquierda = new BotonMovimientoIzquierda();
            this.vboxbotonesseleccionados.getChildren().add(botonIzquierda);
        }else{
            System.out.println("Movimiento Izquierda");
        }
    }
}
