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
        this.lapiz.dibujarCamino(this.posicionActual);
        this.lapiz.actualizarPosicionLapiz(this.posicionActual);
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz) {
        this.lapiz.modificarEstadoLapiz(unEstadoLapiz);
    }


}
