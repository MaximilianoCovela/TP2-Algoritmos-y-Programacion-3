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
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoInvertir(VBoxBotones vbox,
                                               Tablero unTablero, BotonMovimientoInvertir botonInvertir, int index,
                                               VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonInvertir = botonInvertir;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;

    }

    public void handle(ActionEvent event) {

        VboxMovimientoInvertir vBoxDeInvertir = new VboxMovimientoInvertir(this.unTablero);

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonInvertir)){
            this.index = (actualVBox.getChildren()).size();
            actualVBox.getChildren().add(vBoxDeInvertir);

            this.listaDeVBox.add(vBoxDeInvertir);

        }

        vboxBotonesDisponibles.verificar();

    }
}