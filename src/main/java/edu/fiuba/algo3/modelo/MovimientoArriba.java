package edu.fiuba.algo3.modelo;

public class MovimientoArriba implements Movimiento {

    public void modificarAPosicionSiguiente(Posicion unaPosicion){

        unaPosicion.actualizarPosicion(0,1);
    }
}
