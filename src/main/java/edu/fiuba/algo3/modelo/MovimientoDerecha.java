package edu.fiuba.algo3.modelo;

public class MovimientoDerecha implements Movimiento{

    public void calcularPosicionSiguiente(Posicion unaPosicion){

        unaPosicion.actualizarPosicion(1,0);

    }
}
