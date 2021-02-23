package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Observable {

    private ArrayList<Observer> observers;

    public Observable() { this.observers = new ArrayList<>(); }

    public void addObserver(Observer observador) { this.observers.add(observador); }

    public void notifyObservers(Dibujo unDibujo){
        this.observers.stream().forEach(observer -> observer.update(unDibujo));
    }
}
