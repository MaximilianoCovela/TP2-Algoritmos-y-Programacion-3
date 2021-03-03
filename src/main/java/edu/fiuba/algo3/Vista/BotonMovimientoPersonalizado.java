package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPersonalizado;
import edu.fiuba.algo3.modelo.MovimientoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonMovimientoPersonalizado extends Boton {

    private int index;

    public BotonMovimientoPersonalizado(VBoxBotones vboxbotonesseleccionados,
                                        Tablero unTablero, int index, VboxBotonesDisponibles vbd, String nombre,
                                        MovimientoPersonalizado unMovPersonalizado, ArrayList<VBoxBotones> listaDeVbox){
        super();
        this.setText(nombre);
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoPersonalizado(vboxbotonesseleccionados, unTablero, this,
        index, vbd, nombre, unMovPersonalizado, listaDeVbox));
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public Button getButton() {
        return this;
    }

    @Override
    public void setIndex(int i) {
        this.index = i;
    }
}
