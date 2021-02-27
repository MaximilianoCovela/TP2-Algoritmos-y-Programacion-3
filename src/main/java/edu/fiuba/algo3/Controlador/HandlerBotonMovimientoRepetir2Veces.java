package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.Vista.VBoxMovimientoRepetir2Veces;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoRepetir2Veces implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoRepetir2Veces unBotonRepetir2Veces;
    private int index;
    private VBoxMovimientoRepetir2Veces vBoxDeRepetir;

    public HandlerBotonMovimientoRepetir2Veces(VboxBotonesSeleccionados vbox,
                                               Tablero unTablero, BotonMovimientoRepetir2Veces botonRepetir2Veces, int index,
                                               VboxBotonesDisponibles vboxdisponibles){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonRepetir2Veces = botonRepetir2Veces;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.vBoxDeRepetir = new VBoxMovimientoRepetir2Veces();

    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonRepetir2Veces)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoRepetir2Veces botonMovimientoRepetir2Veces = new BotonMovimientoRepetir2Veces(this.vboxbotonesseleccionados,
                    this.unTablero, this.index, vboxBotonesDisponibles);
            this.vboxbotonesseleccionados.getChildren().add(vBoxDeRepetir);
            System.out.println("indice:"+ index);

        }else{
            this.vBoxDeRepetir.eliminarContenido();
            this.vboxbotonesseleccionados.getChildren().remove(this.vBoxDeRepetir);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.vBoxDeRepetir.actualizarTablero();
            System.out.println("Tamaño de Vbox Selecc: "+this.vboxbotonesseleccionados.getChildren().size());
        }
        vboxBotonesDisponibles.verificar();

    }
}
