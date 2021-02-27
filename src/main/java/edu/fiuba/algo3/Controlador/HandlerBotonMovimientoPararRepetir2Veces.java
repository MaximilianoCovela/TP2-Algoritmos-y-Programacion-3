package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoPararRepetir2Veces;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;

public class HandlerBotonMovimientoPararRepetir2Veces {

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoPararRepetir2Veces unBotonPararRepetir;
    private int index;

    public HandlerBotonMovimientoPararRepetir2Veces(VboxBotonesSeleccionados vbox, Tablero unTablero,
                                                    BotonMovimientoPararRepetir2Veces botonPararRepetir, int index){
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
            BotonMovimientoPararRepetir2Veces botonParar = new BotonMovimientoPararRepetir2Veces(this.vboxbotonesseleccionados,
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
