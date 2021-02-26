package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {

    public Dibujo dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion) {

        Posicion unaPosicion = new Posicion(nuevaPosicion.getValorHorizontal(),nuevaPosicion.getValorVertical());

        return (new Vacio(unaPosicion));
    }

    public boolean sePuedeDibujarCamino(){
        return false;
    }

}
