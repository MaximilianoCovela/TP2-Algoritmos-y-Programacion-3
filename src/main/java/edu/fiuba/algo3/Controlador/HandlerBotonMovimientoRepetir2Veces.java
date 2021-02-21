package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoRepetir2Veces implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoRepetir2Veces(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoRepetir2Veces(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoRepetir2Veces botonRepetir2Veces = new BotonMovimientoRepetir2Veces();
            this.vboxbotonesseleccionados.getChildren().add(botonRepetir2Veces);
        }else{
            System.out.println("Movimiento Repetir X2");
        }
    }
}
