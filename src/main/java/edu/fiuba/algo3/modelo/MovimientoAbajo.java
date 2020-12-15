package edu.fiuba.algo3.modelo;

public class MovimientoAbajo implements Movimiento {

    public void calcularPosicionSiguiente(Posicion unaPosicion){

        unaPosicion.actualizarPosicion(0,-1);
    }
}
