package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Movimiento;
import javafx.scene.layout.VBox;

public abstract class VBoxBotones extends VBox {

    public abstract void agregarBloqueATablero();
    public abstract void guardarMovimiento(Movimiento unMovimiento);
    public abstract void actualizarVista(int index);
}
