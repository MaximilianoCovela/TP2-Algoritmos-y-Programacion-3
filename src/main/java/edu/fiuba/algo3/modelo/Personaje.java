package edu.fiuba.algo3.modelo;

public class Personaje {

    private Posicion posicionActual;
    private Lapiz lapiz ;

    public Personaje(){
        posicionActual = new Posicion();
        lapiz = new Lapiz();
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void mover(Movimiento unMovimiento){

        unMovimiento.calcularPosicionSiguiente(this.posicionActual);

        this.modificarPosicionLapiz(this.posicionActual);

    }

    public void modificarPosicionLapiz(Posicion unaPosicion) {


    }

    public void actualizarEstadoLapiz() { }


}
