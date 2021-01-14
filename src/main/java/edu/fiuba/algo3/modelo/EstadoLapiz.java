package edu.fiuba.algo3.modelo;

public interface EstadoLapiz {
    boolean sePuedeDibujarCamino();

    Figura dibujar(Posicion unaPosicion);
}
