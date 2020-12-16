package edu.fiuba.algo3.modelo;

public class BloqueBajarLapiz implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje){
        EstadoLapiz estadoLapiz = new LapizAbajo();
        unPersonaje.modificarEstadoLapiz(estadoLapiz);
    }

}
