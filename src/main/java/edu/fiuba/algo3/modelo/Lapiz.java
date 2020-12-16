package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz;
    private Posicion posicionActual;

    Lapiz(){
        estadoLapiz = new LapizArriba();
        posicionActual = new Posicion();
    }

    /*
    Antes de actualizar la posición se dibuja el camino cuando implementemos la matriz.
    */
    public void dibujarCamino(Posicion posicionNueva){
        this.posicionActual = posicionNueva;
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){
        this.estadoLapiz = unEstadoLapiz;
    }

    public EstadoLapiz getEstadoLapiz(){
        return this.estadoLapiz;
    }

}


