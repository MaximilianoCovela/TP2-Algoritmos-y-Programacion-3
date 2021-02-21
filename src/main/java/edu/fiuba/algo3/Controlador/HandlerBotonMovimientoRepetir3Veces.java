package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoRepetir3Veces;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoRepetir3Veces implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoRepetir3Veces(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoRepetir3Veces(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoRepetir3Veces botonRepetir3Veces = new BotonMovimientoRepetir3Veces();
            this.vboxbotonesseleccionados.getChildren().add(botonRepetir3Veces);
        }else{
            System.out.println("Movimiento Repetir X3");
        }
    }
}