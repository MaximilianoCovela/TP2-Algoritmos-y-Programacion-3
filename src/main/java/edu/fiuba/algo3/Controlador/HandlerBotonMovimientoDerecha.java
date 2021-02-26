package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoAbajo;
import edu.fiuba.algo3.modelo.MovimientoDerecha;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;

public class HandlerBotonMovimientoDerecha implements EventHandler<ActionEvent>{

    private VboxBotonesSeleccionados vboxbotonesseleccionados;
    private Tablero unTablero;
    private BotonMovimientoDerecha unBotonDerecha;
    private int index;

    public HandlerBotonMovimientoDerecha(VboxBotonesSeleccionados vbox,
                                         Tablero unTablero, BotonMovimientoDerecha botonDerecha, int index){
        this.vboxbotonesseleccionados = vbox;
        this.unTablero = unTablero;
        this.unBotonDerecha = botonDerecha;
        this.index = index;
    }

    public int obtenerIndice(){
        return this.index;
    }


    public void handle(ActionEvent event) {
        if(!this.vboxbotonesseleccionados.getChildren().contains(this.unBotonDerecha)){
            this.index = (this.vboxbotonesseleccionados.getChildren()).size();
            BotonMovimientoDerecha botonDerecha = new BotonMovimientoDerecha(this.vboxbotonesseleccionados,
                    this.unTablero,this.index);

            this.vboxbotonesseleccionados.getChildren().add(botonDerecha);
            MovimientoDerecha movDerecha = new MovimientoDerecha();
            Bloque unBloque = new Bloque(movDerecha);
            this.unTablero.agregarBloque(unBloque);
        }else{
            this.vboxbotonesseleccionados.getChildren().remove(this.unBotonDerecha);
            this.unTablero.eliminarBloques(this.index);
        }
    }
}
