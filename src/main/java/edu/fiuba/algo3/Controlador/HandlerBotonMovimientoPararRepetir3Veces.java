package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoPararRepetir3Veces;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoPararRepetir3Veces implements EventHandler<ActionEvent> {

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoPararRepetir3Veces unBotonPararRepetir;
    private int index;

    public HandlerBotonMovimientoPararRepetir3Veces(VboxBotonesSeleccionados vbox, Tablero unTablero,
                                                    BotonMovimientoPararRepetir3Veces botonPararRepetir, int index){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonPararRepetir = botonPararRepetir;
        this.index = index;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonPararRepetir)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoPararRepetir3Veces botonParar = new BotonMovimientoPararRepetir3Veces(this.vboxbotonesseleccionados,
                    this.unTablero,this.index);
            this.vboxbotonesseleccionados.getChildren().add(botonParar);

            MovimientoLapizArriba movimientoLapizArriba = new MovimientoLapizArriba();
            Bloque unBloque = new Bloque(movimientoLapizArriba);

            this.unTablero.agregarBloque(unBloque);

        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonPararRepetir);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
    }

}
