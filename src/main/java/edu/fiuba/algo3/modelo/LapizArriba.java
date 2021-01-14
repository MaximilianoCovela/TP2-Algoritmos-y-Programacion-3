package edu.fiuba.algo3.modelo;

public class LapizArriba implements EstadoLapiz {

    public Figura dibujar(Posicion unaPosicion) {
        Dibujo unDibujo = new Vacio();
        return (new Figura(unaPosicion, unDibujo));
    }
}
