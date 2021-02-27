package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoRepetir3Veces implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoRepetir3Veces unBotonRepetir3Veces;
    private int index;
    private VBoxMovimientoRepetir3Veces vBoxDeRepetir;

    public HandlerBotonMovimientoRepetir3Veces(VboxBotonesSeleccionados vbox,
                                               Tablero unTablero, BotonMovimientoRepetir3Veces botonRepetir3Veces, int index,
                                               VboxBotonesDisponibles vboxdisponibles){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonRepetir3Veces = botonRepetir3Veces;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.vBoxDeRepetir = new VBoxMovimientoRepetir3Veces();
    }

    public void handle(ActionEvent event) {
        /*
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonRepetir3Veces)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoRepetir3Veces botonMovimientoRepetir3Veces = new BotonMovimientoRepetir3Veces(this.vboxbotonesseleccionados,
                    this.unTablero, this.index, vboxBotonesDisponibles);
            this.vboxbotonesseleccionados.getChildren().add(vBoxDeRepetir);

        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.vBoxDeRepetir);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.vBoxDeRepetir.actualizarTablero();
        }
        vboxBotonesDisponibles.verificar();
        */
    }
}