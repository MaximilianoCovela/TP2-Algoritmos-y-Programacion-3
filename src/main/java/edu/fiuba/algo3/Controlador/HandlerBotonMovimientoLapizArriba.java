package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizAbajo;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonMovimientoLapizArriba implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoLapizArriba unBotonLapizArriba;
    private int index;

    public HandlerBotonMovimientoLapizArriba(VboxBotonesSeleccionados vbox,Tablero unTablero,
                                             BotonMovimientoLapizArriba botonLapizAbajo,int index){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonLapizArriba = botonLapizAbajo;
        this.index = index;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonLapizArriba)){
            BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba(this.vboxbotonesseleccionados,
                    this.unTablero,this.index);
            this.vboxbotonesseleccionados.getChildren().add(botonLapizArriba);

            MovimientoLapizArriba movimientoLapizArriba = new MovimientoLapizArriba();
            Bloque unBloque = new Bloque(movimientoLapizArriba);

            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonLapizArriba);
            this.unTablero.eliminarBloques(this.index);
        }
    }


}
