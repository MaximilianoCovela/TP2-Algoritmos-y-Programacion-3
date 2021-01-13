package edu.fiuba.algo3.modelo;

public class MovimientoLapizArriba {

    public void aplicarMovimiento(Personaje unPersonaje){

        EstadoLapiz unEstadoLapiz = new LapizArriba();

        unPersonaje.modificarEstadoLapiz(unEstadoLapiz);

    }

}
