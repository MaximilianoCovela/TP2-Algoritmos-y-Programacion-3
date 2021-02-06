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

    public void actualizarPosicion(Posicion unaPosicion){
        Posicion antiguaPosicion = this.posicionActual;
        posicionActual = posicionActual.actualizarPosicion(unaPosicion);
        this.lapiz.dibujarCamino(antiguaPosicion, posicionActual);

    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz) {
        this.lapiz.modificarEstadoLapiz(unEstadoLapiz);
    }

    public Lapiz getLapiz(){
        return this.lapiz;
    }

    public boolean enPosicion(Posicion unaPosicion){
        return this.posicionActual.esIgualA(unaPosicion);
    }


}
