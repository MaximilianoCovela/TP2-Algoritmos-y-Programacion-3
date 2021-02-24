package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class SectorDibujo implements Observable{
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<>();

    public ArrayList<Dibujo> mostrarDibujos(){
        return this.listaDeDibujos;
    }

    public void addObserver(Observer observador) { this.observers.add(observador); }

    public void notifyObservers(Dibujo unDibujo){
        System.out.println("Observalbe : Notificacion");
        this.observers.forEach(observer -> observer.update(unDibujo));
    }

    public void actualizarDibujos(ArrayList<Dibujo> unaListaDeDibujos){
        this.listaDeDibujos = unaListaDeDibujos;
    }

    public void ejecutarMovimientosDelPersonaje(Personaje unPersonaje){
        System.out.println("Modelo : SectorDibujo EjecutarMov");
        System.out.println("Modelo : Con una lista de");
        System.out.println(this.listaDeDibujos.size());
        for( Dibujo unDibujo : listaDeDibujos){
            notifyObservers(unDibujo);
        }
    }
}
