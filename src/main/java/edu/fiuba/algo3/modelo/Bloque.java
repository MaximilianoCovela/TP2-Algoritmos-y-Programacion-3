package edu.fiuba.algo3.modelo;

public class Bloque {
    private Movimiento unMovimiento;
    private EstadoLapiz unEstadoLapiz;

    Bloque(Movimiento unTipoMovimiento){
        this.unMovimiento = unTipoMovimiento;
    }

    Bloque(EstadoLapiz estadoLapiz){
        this.unEstadoLapiz = estadoLapiz;
    }

    void aplicarMovimiento(Personaje unPersonaje){
        // unPersonaje.actualizarPosicion(unPersonaje.getPosicionActual());

        this.unMovimiento.aplicarMovimiento(unPersonaje);


    }

    /*void modificarEstadoLapiz(Personaje unPersonaje){
        unPersonaje.modificarEstadoLapiz(this.unEstadoLapiz);
    }
    */
    //esto ya no va a estar porque le mandan el movimiento MovimientoLapizArriba y el MovimientoLapizAbajo
}
