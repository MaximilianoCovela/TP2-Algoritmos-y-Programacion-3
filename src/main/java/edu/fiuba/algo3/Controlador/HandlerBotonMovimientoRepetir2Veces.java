package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoRepetir2Veces implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoRepetir2Veces unBotonRepetir2Veces;
    private int index;
    private MovimientoRepetir movimientosARepetir;

    public HandlerBotonMovimientoRepetir2Veces(VboxBotonesSeleccionados vbox,
                                               Tablero unTablero, BotonMovimientoRepetir2Veces botonRepetir2Veces, int index,
                                               VboxBotonesDisponibles vboxdisponibles){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonRepetir2Veces = botonRepetir2Veces;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonRepetir2Veces)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoRepetir2Veces botonMovimientoRepetir2Veces = new BotonMovimientoRepetir2Veces(this.vboxbotonesseleccionados,
                    this.unTablero, this.index, vboxBotonesDisponibles);
            this.vboxbotonesseleccionados.getChildren().add(botonMovimientoRepetir2Veces);
            MovimientoRepetir movRepetir2Veces = new MovimientoRepetir(2);
            this.movimientosARepetir = movRepetir2Veces;
            Bloque unBloque = new Bloque(movRepetir2Veces);
            this.unTablero.agregarBloque(unBloque);

        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonRepetir2Veces);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();

    }
}
