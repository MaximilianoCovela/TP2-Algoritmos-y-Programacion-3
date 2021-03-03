package edu.fiuba.algo3.Vista;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.scene.control.Button;

public abstract class Boton extends Button {
    public abstract int getIndex();

    public abstract Button getButton();

    public abstract void setIndex(int i);
}
