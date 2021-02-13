package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {

    public Dibujo dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion) {

        return (new Vacio(nuevaPosicion));
    }

    public boolean sePuedeDibujarCamino(){
        return false;
    }
}
