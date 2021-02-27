package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoPararRepetir2Veces;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoPararRepetir2Veces implements EventHandler<ActionEvent> {

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoPararRepetir2Veces unBotonPararRepetir;
    private int index;
    private ArrayList listaDeVBox;


    public HandlerBotonMovimientoPararRepetir2Veces(VboxBotonesSeleccionados vbox, Tablero unTablero,
                                                    BotonMovimientoPararRepetir2Veces botonPararRepetir, int index,
                                                    ArrayList listaDeVBox){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonPararRepetir = botonPararRepetir;
        this.index = index;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonPararRepetir)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoPararRepetir2Veces botonParar = new BotonMovimientoPararRepetir2Veces(this.vboxbotonesseleccionados,
                    this.unTablero,this.index, this.listaDeVBox);
            this.vboxbotonesseleccionados.getChildren().add(botonParar);

        }else{
            // por ahora esto funciona como si fuera una x para borrar la vbox que se creo con botones repetir
            this.vboxbotonesseleccionados.getChildren().clear();
            //this.vboxbotonesseleccionados.getChildren().remove(this.unBotonPararRepetir);
            //this.vboxbotonesseleccionados.actualizarVista(this.index);
            //this.unTablero.eliminarBloques(this.index);
        }
    }


}
