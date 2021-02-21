package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoLapizArriba(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoLapizArriba(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {
        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba();
            this.vboxbotonesseleccionados.getChildren().add(botonLapizArriba);
        }else{
            System.out.println("Lapiz Arriba");
        }
    }

}
