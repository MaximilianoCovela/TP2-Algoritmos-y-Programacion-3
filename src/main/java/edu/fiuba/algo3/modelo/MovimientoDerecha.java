package edu.fiuba.algo3.modelo;

public class MovimientoDerecha implements Movimiento{

    public void aplicarMovimiento(Personaje unPersonaje){

        Posicion unaPosicion = new Posicion(1,0);

        unPersonaje.actualizarPosicion(unaPosicion);

    }

}
