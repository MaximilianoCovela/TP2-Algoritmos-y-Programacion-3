package edu.fiuba.algo3.modelo;

public class MovimientoLapizAbajo {

    public void aplicarMovimiento(Personaje unPersonaje){

        EstadoLapiz unEstadoLapiz = new LapizAbajo();

        unPersonaje.modificarEstadoLapiz(unEstadoLapiz);

    }

}
