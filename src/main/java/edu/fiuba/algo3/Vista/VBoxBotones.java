package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public abstract class VBoxBotones extends VBox {

    public abstract void agregarBloqueATablero();
    public abstract void guardarMovimiento(Movimiento unMovimiento);
    public abstract void actualizarVista(int index);
    public abstract void eliminarMovimiento(int index);

    public abstract void actualizarMovimientos(int indexBotonASubir, int i);
}
