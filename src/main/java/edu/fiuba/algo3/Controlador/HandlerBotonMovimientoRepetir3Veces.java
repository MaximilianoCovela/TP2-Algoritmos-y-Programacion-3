package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoRepetir3Veces implements EventHandler<ActionEvent>{

    private final VBoxBotones vBoxBotones;
    private final VboxBotonesDisponibles vboxBotonesDisponibles;
    private final Tablero unTablero;
    private final BotonMovimientoRepetir3Veces unBotonRepetir3Veces;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoRepetir3Veces(VBoxBotones vbox,
                                               Tablero unTablero, BotonMovimientoRepetir3Veces botonRepetir3Veces, int index,
                                               VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonRepetir3Veces = botonRepetir3Veces;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;

    }

    public void handle(ActionEvent event) {

        VBoxMovimientoRepetir3Veces vBoxDeRepetir = new VBoxMovimientoRepetir3Veces(this.unTablero);

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonRepetir3Veces)){
            this.index = (actualVBox.getChildren()).size();

            actualVBox.getChildren().add(vBoxDeRepetir);

            this.listaDeVBox.add(vBoxDeRepetir);

        }
        vboxBotonesDisponibles.verificar();

    }
}