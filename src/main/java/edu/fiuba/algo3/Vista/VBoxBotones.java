package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public abstract class VBoxBotones extends VBox {

    protected int indexVBox = 0; // lo inicializo en 0, por si no se cambia, es la 1er vbox

    public abstract void agregarBloqueATablero();
    public abstract void guardarMovimiento(Movimiento unMovimiento);
    public abstract void actualizarVista(int index);
    public abstract void eliminarMovimiento(int index); //falta implementar que cuando ya se haya cerrado no se pueda borrar

    public int getIndiceVBox(){

        return this.indexVBox;

    }

    public void setIndexVBox(int indexVBox) { // lo que va a almacenar es el indice de la posicion de la vbox
        // en la vbox anterior.
        this.indexVBox = indexVBox;
    }

}
