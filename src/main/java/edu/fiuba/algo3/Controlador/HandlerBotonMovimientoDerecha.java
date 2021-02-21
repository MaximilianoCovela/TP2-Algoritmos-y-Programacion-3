package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoDerecha implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoDerecha(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoDerecha(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha();
            this.vboxbotonesseleccionados.getChildren().add(botonDerecha);
        }else{
            System.out.println("Movimiento Derecha");
        }
    }
}
