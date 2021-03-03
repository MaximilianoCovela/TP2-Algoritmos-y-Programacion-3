package edu.fiuba.algo3.modelo;

public interface Observable {

    void addObserver(Observer observador);

    void notifyObservers(Dibujo unDibujo, Boolean estado);

}
