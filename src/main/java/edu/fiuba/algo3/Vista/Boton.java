package edu.fiuba.algo3.Vista;
import edu.fiuba.algo3.modelo.Personaje;
import javafx.scene.control.Button;

public abstract class Boton extends Button {
    public abstract int getIndex(); //chequear que se haya actualizado el indice correctamente dentro de cada boton a ver si falla x eso

    public abstract Button getButton();

    public abstract String getNombre();

    public abstract void setIndex(int i);
}
