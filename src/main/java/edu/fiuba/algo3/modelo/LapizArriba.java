package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {

    public Figura dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion) {
        Dibujo unDibujo = new Vacio();
        return (new Figura(antiguaPosicion,nuevaPosicion, unDibujo));
    }

    public boolean sePuedeDibujarCamino(){
        return false;
    }
}
