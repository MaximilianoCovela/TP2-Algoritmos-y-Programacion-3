package edu.fiuba.algo3.modelo;

public interface EstadoLapiz {

    void dibujarCamino(Posicion posicionVieja, Posicion posicionNueva);

    boolean sePuedeDibujarCamino();
}
