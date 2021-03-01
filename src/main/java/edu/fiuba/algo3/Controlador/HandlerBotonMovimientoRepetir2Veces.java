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

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        if(!this.vBoxBotones.getChildren().contains(this.unBotonRepetir2Veces)){
            this.index = (actualVBox.getChildren()).size();
            BotonMovimientoRepetir2Veces botonMovimientoRepetir2Veces = new BotonMovimientoRepetir2Veces(this.vBoxBotones,
                    this.unTablero, this.index, vboxBotonesDisponibles, this.listaDeVBox);
            actualVBox.getChildren().add(vBoxDeRepetir);

            this.listaDeVBox.add(vBoxDeRepetir);

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
