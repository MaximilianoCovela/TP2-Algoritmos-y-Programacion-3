package edu.fiuba.algo3.modelo;

public class MovimientoDerecha implements Movimiento{

    public void aplicarMovimiento(Personaje unPersonaje){

        Posicion unaPosicion = new Posicion();

        unaPosicion.setPosicion(1, 0);

        unPersonaje.actualizarPosicion(unaPosicion);

    }


    /* public void modificarAPosicionSiguiente(Posicion unaPosicion){

        unaPosicion.actualizarPosicion(1,0);

    } */
}
