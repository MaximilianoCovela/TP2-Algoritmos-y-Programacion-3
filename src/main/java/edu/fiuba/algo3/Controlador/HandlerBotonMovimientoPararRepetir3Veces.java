package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoLapizArriba;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonMovimientoPararRepetir3Veces implements EventHandler<ActionEvent> {

    private final VBoxBotones vBoxBotones;
    private Tablero unTablero;
    private BotonMovimientoPararRepetir3Veces unBotonPararRepetir;
    private int index;
    private ArrayList<VBoxBotones> listaDeVBox;


    public HandlerBotonMovimientoPararRepetir3Veces(VBoxBotones vbox, Tablero unTablero,
                                                    BotonMovimientoPararRepetir3Veces botonPararRepetir, int index,
                                                    ArrayList<VBoxBotones> listaDeVBox){
        this.vBoxBotones = vbox;
        this.unTablero = unTablero;
        this.unBotonPararRepetir = botonPararRepetir;
        this.index = index;
        this.listaDeVBox = listaDeVBox;
    }

    public int obtenerIndice(){
        return this.index;
    }

    public void handle(ActionEvent event) {

        VBoxBotones actualVBox = this.listaDeVBox.get(listaDeVBox.size()-1); // es la ultima creada o selecc

        VBoxMovimientoRepetir3Veces vbox;
        vbox = (VBoxMovimientoRepetir3Veces) this.listaDeVBox.get(listaDeVBox.size()-1);

        if(!this.vBoxBotones.getChildren().contains(this.unBotonPararRepetir)){
            this.index = (this.vBoxBotones.getChildren()).size();

            //BotonMovimientoPararRepetir3Veces botonParar = new BotonMovimientoPararRepetir3Veces(this.vBoxBotones,
            //       this.unTablero,this.index, this.listaDeVBox);
            // suponiendo que existe una vbox

            if(this.listaDeVBox.size() == 1){

                vbox.agregarBloqueATablero();

            }else{

                VBoxBotones vBoxAnteUltima = this.listaDeVBox.get(listaDeVBox.size()-2);

                vBoxAnteUltima.guardarMovimiento(vbox.devolverMovimientos());

            }

            if(listaDeVBox.size() > 0){

                //VBoxMovimientoRepetir3Veces vbox;
                //vbox = (VBoxMovimientoRepetir3Veces) this.listaDeVBox.get(listaDeVBox.size()-1);
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
