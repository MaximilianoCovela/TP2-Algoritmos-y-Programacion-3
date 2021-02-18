package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Personaje {

    private Posicion posicionActual;
    private Lapiz lapiz ;
    private ArrayList<Dibujo> listaDeDibujos;

    public Personaje(){
        posicionActual = new Posicion();
        lapiz = new Lapiz();
        listaDeDibujos = new ArrayList<>();
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void actualizarPosicion(Posicion unaPosicion){
        Posicion antiguaPosicion = this.posicionActual;
        posicionActual = posicionActual.actualizarPosicion(unaPosicion);
        Dibujo unDibujo = this.lapiz.dibujarCamino(antiguaPosicion, posicionActual);
        this.listaDeDibujos.add(unDibujo);
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz) {
        this.lapiz.modificarEstadoLapiz(unEstadoLapiz);
    }

    public Lapiz getLapiz(){
        return this.lapiz;
    }

    public boolean enPosicion(Posicion unaPosicion){
        return this.posicionActual.esIgualA(unaPosicion);
    }

    public ArrayList<Dibujo> obtenerDibujos(){
        return this.listaDeDibujos;
    }


}
