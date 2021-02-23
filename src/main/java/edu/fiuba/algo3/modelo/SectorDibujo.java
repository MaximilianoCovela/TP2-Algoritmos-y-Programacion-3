package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class SectorDibujo extends Observable{

    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<>();

    public ArrayList<Dibujo> mostrarDibujos(){
        return this.listaDeDibujos;
    }

    public void actualizarDibujos(ArrayList<Dibujo> unaListaDeDibujos){
        this.listaDeDibujos = unaListaDeDibujos;
    }

    public void ejecutarMovimientosDelPersonaje(Personaje unPersonaje){
        for( Dibujo unDibujo : listaDeDibujos){
            notifyObservers(unDibujo);
        }
    }
}
