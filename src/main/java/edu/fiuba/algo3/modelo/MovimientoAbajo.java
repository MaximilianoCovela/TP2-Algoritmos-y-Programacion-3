package edu.fiuba.algo3.modelo;

public class MovimientoAbajo implements Movimiento {

    public void aplicarMovimiento(Personaje unPersonaje){

        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(0, -1);

        unPersonaje.actualizarPosicion(unaPosicion);

    }
}
