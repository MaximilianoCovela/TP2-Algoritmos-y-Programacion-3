package edu.fiuba.algo3.modelo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.util.ArrayList;

public class SectorDibujo implements Observable{
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<>();
    private Boolean unEstado;


    public void addObserver(Observer observador) { this.observers.add(observador); }

    public void notifyObservers(Dibujo unDibujo, Boolean estado){
        this.observers.forEach(observer -> observer.update(unDibujo, estado));
    }

    public void actualizarDibujos(ArrayList<Dibujo> unaListaDeDibujos){
        this.listaDeDibujos = unaListaDeDibujos;
    }

    public void ejecutarMovimientosDelPersonaje(){

        int i = 1;

        this.unEstado = true;

        for( Dibujo unDibujo : listaDeDibujos){

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(i), actionEvent -> notifyObservers(unDibujo, this.unEstado)));
            timeline.play();
            i++;
        }
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(i), actionEvent -> notifyObservers(null, false)));
        timeline.play();

    }
}
