package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoPararInvertir implements EventHandler<ActionEvent> {

    private final VBoxBotones vBoxBotones;
    private Tablero unTablero;
    private BotonMovimientoPararInvertir unBotonPararInvertir;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoPararInvertir(VBoxBotones vbox, Tablero unTablero,
                                                    BotonMovimientoPararInvertir botonPararInvertir, int index,
                                                    ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonPararInvertir = botonPararInvertir;
        this.index = index;
        this.listaDeVBox = listaDeVBox;
    }

    public void handle(ActionEvent event) {

        VboxMovimientoInvertir vbox;

        try{
            vbox = (VboxMovimientoInvertir) this.listaDeVBox.get(listaDeVBox.size()-1);

        }catch(Exception e){

            return;

        }

        if(!this.vBoxBotones.getChildren().contains(this.unBotonPararInvertir)){
            this.index = (this.vBoxBotones.getChildren()).size();

            if(this.listaDeVBox.size() == 1){

                vbox.agregarBloqueATablero();

            }else{

                VBoxBotones vBoxAnteUltima = this.listaDeVBox.get(listaDeVBox.size()-2);

                vBoxAnteUltima.guardarMovimiento(vbox.devolverMovimientos());
            }

            if(listaDeVBox.size() > 0){

                this.listaDeVBox.remove(listaDeVBox.size()-1);
            }

        }else{

            this.vBoxBotones.getChildren().clear();

        }
    }
}
