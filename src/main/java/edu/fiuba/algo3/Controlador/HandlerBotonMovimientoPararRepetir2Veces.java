package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoPararRepetir2Veces implements EventHandler<ActionEvent> {

    private final VBoxBotones vBoxBotones;
    private Tablero unTablero;
    private BotonMovimientoPararRepetir2Veces unBotonPararRepetir;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoPararRepetir2Veces(VBoxBotones vbox, Tablero unTablero,
                                                    BotonMovimientoPararRepetir2Veces botonPararRepetir, int index,
                                                    ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonPararRepetir = botonPararRepetir;
        this.index = index;
        this.listaDeVBox = listaDeVBox;
    }

    public void handle(ActionEvent event) {

        VBoxMovimientoRepetir2Veces vbox;

        try{
            vbox = (VBoxMovimientoRepetir2Veces) this.listaDeVBox.get(listaDeVBox.size()-1);

        }catch(Exception e){

            return;

        }


        if(!this.vBoxBotones.getChildren().contains(this.unBotonPararRepetir)){
            this.index = (this.vBoxBotones.getChildren()).size();

            if(this.listaDeVBox.size() == 1){

                vbox.agregarBloqueATablero();

            }else{

                VBoxBotones vBoxAnteUltima = this.listaDeVBox.get(listaDeVBox.size()-2);

                vBoxAnteUltima.guardarMovimiento(vbox.devolverMovimientos());

            }

            if(listaDeVBox.size() > 1){

                this.listaDeVBox.remove(listaDeVBox.size()-1);

            }

        }
    }


}
