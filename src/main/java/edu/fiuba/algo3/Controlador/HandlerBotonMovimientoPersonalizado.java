package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoPersonalizado;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoPersonalizado implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoPersonalizado(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoPersonalizado(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado();
            this.vboxbotonesseleccionados.getChildren().add(botonPersonalizado);
        }else{
            System.out.println("Movimiento Personalizado");
        }
    }
}
