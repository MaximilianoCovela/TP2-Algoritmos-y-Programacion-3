package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoAbajo;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;

public class HandlerBotonMovimientoAbajo implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoAbajo(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoAbajo(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoAbajo botonAbajo = new BotonMovimientoAbajo();
            this.vboxbotonesseleccionados.getChildren().add(botonAbajo);
        }else{
            System.out.println("Movimiento Abajo");
        }

    }
}
