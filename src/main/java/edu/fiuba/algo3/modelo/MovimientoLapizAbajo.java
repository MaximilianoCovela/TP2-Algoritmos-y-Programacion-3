package edu.fiuba.algo3.modelo;

public class MovimientoLapizAbajo implements Movimiento {

    public void aplicarMovimiento(Personaje unPersonaje){
        EstadoLapiz unEstadoLapiz = new LapizAbajo();
        unPersonaje.modificarEstadoLapiz(unEstadoLapiz);
    }

    public void invertirMovimiento(Personaje unPersonaje){
        EstadoLapiz unEstadoLapiz = new LapizArriba();
        unPersonaje.modificarEstadoLapiz(unEstadoLapiz);
    }

}
