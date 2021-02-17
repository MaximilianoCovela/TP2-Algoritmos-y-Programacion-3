package edu.fiuba.algo3.modelo;

public interface EstadoLapiz {
    boolean sePuedeDibujarCamino();

    Dibujo dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion);
}
