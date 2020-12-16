package edu.fiuba.algo3.modelo;

public class BloqueSubirLapiz implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje){
        EstadoLapiz estadoLapiz = new LapizArriba();
        unPersonaje.modificarEstadoLapiz(estadoLapiz);
    }

}
