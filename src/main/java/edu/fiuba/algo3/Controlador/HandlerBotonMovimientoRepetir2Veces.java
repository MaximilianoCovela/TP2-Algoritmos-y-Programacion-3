package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoRepetir2Veces implements EventHandler<ActionEvent>{

    private final VBoxBotones vBoxBotones;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private Tablero unTablero;
    private BotonMovimientoRepetir2Veces unBotonRepetir2Veces;
    private int index;
    private VBoxMovimientoRepetir2Veces vBoxDeRepetir;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoRepetir2Veces(VBoxBotones vbox,
                                               Tablero unTablero, BotonMovimientoRepetir2Veces botonRepetir2Veces, int index,
                                               VboxBotonesDisponibles vboxdisponibles, ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonRepetir2Veces = botonRepetir2Veces;
        this.index = index;
        this.vboxBotonesDisponibles = vboxdisponibles;
        this.listaDeVBox = listaDeVBox;

    }

    public void handle(ActionEvent event) {

        VBoxMovimientoRepetir2Veces vBoxDeRepetir = new VBoxMovimientoRepetir2Veces(this.unTablero);

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonRepetir2Veces)){
            this.index = (actualVBox.getChildren()).size();

            actualVBox.getChildren().add(vBoxDeRepetir);

            this.listaDeVBox.add(vBoxDeRepetir);

        }

        vboxBotonesDisponibles.verificar();

    }
}
