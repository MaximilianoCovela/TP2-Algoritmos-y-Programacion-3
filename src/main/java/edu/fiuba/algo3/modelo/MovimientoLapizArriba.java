package edu.fiuba.algo3.modelo;

public class MovimientoLapizArriba implements Movimiento{

    public void aplicarMovimiento(Personaje unPersonaje){

        EstadoLapiz unEstadoLapiz = new LapizArriba();

        unPersonaje.modificarEstadoLapiz(unEstadoLapiz);

    }

}
