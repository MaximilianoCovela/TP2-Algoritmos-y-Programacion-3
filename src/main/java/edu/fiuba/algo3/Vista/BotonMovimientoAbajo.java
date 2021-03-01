package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoAbajo extends Boton {

    private HandlerBotonMovimientoAbajo accion;
    private int index;
// antes decia VboxBotonesSeleccionados vboxbotonesseleccionados en el 1er parametro
    public BotonMovimientoAbajo(VBoxBotones vBoxBotones, Tablero unTablero,
                                int index, VboxBotonesDisponibles vboxbotonesdisponibles, ArrayList listaDeVBox){
        super();
        this.setText("Abajo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoAbajo(vBoxBotones,
                unTablero, this, index, vboxbotonesdisponibles, listaDeVBox );
        this.index = index; //hay que ver si esto funciona, no me acuerdo como lo hicimos antes XXXX
        this.setOnAction(accion);
    }

    public int getIndex(){

        return index;

    }

    public Button getButton(){
        return this;
    }


    public String getNombre(){

        return "Funciono wei u-u no soy nulito";

    }

    public void setIndex(int i){
        System.out.println("Indice viejo " + this.index);
        System.out.println("Indice por parametro " + i);
        this.index = i;
        System.out.println("Indice nuevo " + this.index);
    }

}
