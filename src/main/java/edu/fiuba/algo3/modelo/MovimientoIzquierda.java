package edu.fiuba.algo3.modelo;

public class MovimientoIzquierda implements Movimiento {

    public void aplicarMovimiento(Personaje unPersonaje){

        Posicion unaPosicion = new Posicion(-1, 0);

        unPersonaje.actualizarPosicion(unaPosicion);

    }

    public void invertirMovimiento(Personaje unPersonaje) {
        Posicion unaPosicion = new Posicion(1, 0);
        unPersonaje.actualizarPosicion(unaPosicion);
    }

}
