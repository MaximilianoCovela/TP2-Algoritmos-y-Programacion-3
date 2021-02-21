
package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoArriba;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class HandlerBotonMovimientoArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoArriba(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoArriba(){
        this.vboxbotonesseleccionados = null;
    }


    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoArriba botonArriba = new BotonMovimientoArriba();
            this.vboxbotonesseleccionados.getChildren().add(botonArriba);
        }else{
            System.out.println("Movimiento Arriba");
        }
    }
}