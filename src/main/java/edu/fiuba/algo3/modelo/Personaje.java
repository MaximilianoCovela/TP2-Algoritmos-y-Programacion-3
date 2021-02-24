package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Personaje {

    private Posicion posicionActual;
    private Lapiz lapiz = new Lapiz();
    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<>();

    public Personaje(){
        this.posicionActual = new Posicion(4, 4);
    }

    public Personaje(Posicion unaPosicion){
        this.posicionActual = unaPosicion;
    }

    public void actualizarPosicion(Posicion unaPosicion){
        Posicion antiguaPosicion = this.posicionActual;
        posicionActual = posicionActual.actualizarPosicion(unaPosicion);
        Dibujo unDibujo = this.lapiz.dibujarCamino(antiguaPosicion, posicionActual);
        this.listaDeDibujos.add(unDibujo);
    }

    public void reiniciarPosicion(){
        this.posicionActual = new Posicion(4,4);
        this.modificarEstadoLapiz(new LapizArriba());
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){
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
