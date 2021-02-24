package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public interface Observable {

    void addObserver(Observer observador);

    void notifyObservers(Dibujo unDibujo);
}
