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

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        VboxMovimientoInvertir vbox;
        vbox = (VboxMovimientoInvertir) this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonPararInvertir)){
            this.index = (this.vBoxBotones.getChildren()).size();

            //BotonMovimientoPararRepetir2Veces botonParar = new BotonMovimientoPararRepetir2Veces(this.vBoxBotones,
            //       this.unTablero,this.index, this.listaDeVBox);
            // suponiendo que existe una vbox

            if(this.listaDeVBox.size() == 1){

                vbox.agregarBloqueATablero();

            }else{

                VBoxBotones vBoxAnteUltima = this.listaDeVBox.get(listaDeVBox.size()-2);

                vBoxAnteUltima.guardarMovimiento(vbox.devolverMovimientos());

            }

            if(listaDeVBox.size() > 0){

                //VBoxMovimientoRepetir2Veces vbox;
                //vbox = (VBoxMovimientoRepetir2Veces) this.listaDeVBox.get(listaDeVBox.size()-1);
                //vbox.agregarBloqueATablero();

                this.listaDeVBox.remove(listaDeVBox.size()-1); // la borramos del array, no de la vista la vbox

            }

        }else{
            // por ahora esto funciona como si fuera una x para borrar la vbox que se creo con botones repetir
            this.vBoxBotones.getChildren().clear();
            //this.vBoxBotones.getChildren().remove(this.unBotonPararRepetir);
            //this.vBoxBotones.actualizarVista(this.index);
            //this.unTablero.eliminarBloques(this.index);
        }
    }


}
