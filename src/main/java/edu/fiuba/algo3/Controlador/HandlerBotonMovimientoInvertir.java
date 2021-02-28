package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoInvertir implements EventHandler<ActionEvent>{

    private final VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoInvertir unBotonInvertir;
    private int index;
    private VBoxMovimientoRepetir2Veces vBoxDeRepetir;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoInvertir(VBoxBotones vbox,
                                               Tablero unTablero, BotonMovimientoInvertir botonInvertir, int index,
                                               VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonInvertir = botonInvertir;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;

    }

    public void handle(ActionEvent event) {

        VboxMovimientoInvertir vBoxDeInvertir = new VboxMovimientoInvertir(this.unTablero);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonInvertir)){
            this.index = (this.vBoxBotones.getChildren()).size();
            BotonMovimientoInvertir BotonMovimientoInvertir = new BotonMovimientoInvertir(this.vBoxBotones,
                    this.unTablero, this.index, vboxBotonesDisponibles, this.listaDeVBox);
            this.vBoxBotones.getChildren().add(vBoxDeInvertir);

            this.listaDeVBox.add(vBoxDeInvertir);

            System.out.println("indice:"+ index);

        }else{
            /*
            this.vBoxDeRepetir.eliminarContenido();
            this.vBoxBotones.getChildren().remove(this.vBoxDeRepetir);
            this.vBoxBotones.actualizarVista(this.index);
            this.vBoxDeRepetir.actualizarTablero();

             */
            System.out.println("adios");
        }
        vboxBotonesDisponibles.verificar();

    }
}