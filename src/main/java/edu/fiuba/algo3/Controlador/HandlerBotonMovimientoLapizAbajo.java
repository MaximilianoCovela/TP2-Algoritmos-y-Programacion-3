package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizAbajo;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizAbajo implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;

    public HandlerBotonMovimientoLapizAbajo(VboxBotonesSeleccionados vbox){
        this.vboxbotonesseleccionados = vbox;
    }

    public HandlerBotonMovimientoLapizAbajo(){
        this.vboxbotonesseleccionados = null;
    }

    public void handle(ActionEvent event) {

        if(this.vboxbotonesseleccionados != null){
            BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo();
            this.vboxbotonesseleccionados.getChildren().add(botonLapizAbajo);
        }else{
            System.out.println("Lapiz Abajo");
        }
    }

}
