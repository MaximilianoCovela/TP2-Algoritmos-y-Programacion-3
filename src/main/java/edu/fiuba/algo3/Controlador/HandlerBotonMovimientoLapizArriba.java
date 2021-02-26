package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizAbajo;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoLapizArriba unBotonLapizArriba;
    private int index;

    public HandlerBotonMovimientoLapizArriba(VboxBotonesSeleccionados vbox,Tablero unTablero,
                                             BotonMovimientoLapizArriba botonLapizAbajo,int index,
                                             VboxBotonesDisponibles vboxdisponibles){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonLapizArriba = botonLapizAbajo;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizArriba)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba(this.vboxbotonesseleccionados,
                    this.unTablero,this.index, this.vboxBotonesDisponibles);
            this.vboxbotonesseleccionados.getChildren().add(botonLapizArriba);

            MovimientoLapizArriba movimientoLapizArriba = new MovimientoLapizArriba();
            Bloque unBloque = new Bloque(movimientoLapizArriba);

            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonLapizArriba);
            this.vboxbotonesseleccionados.actualizarVista(this.index);
            this.unTablero.eliminarBloques(this.index);
        }
        vboxBotonesDisponibles.verificar();
    }


}
