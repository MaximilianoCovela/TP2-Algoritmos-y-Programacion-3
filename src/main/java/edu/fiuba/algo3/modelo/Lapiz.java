package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz = new LapizArriba();

    public Dibujo dibujarCamino(Posicion antiguaPosicion,Posicion nuevaPosicion){
        return (this.estadoLapiz.dibujar(antiguaPosicion,nuevaPosicion));
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){
        this.estadoLapiz = unEstadoLapiz;
    }

    public boolean esPosibleDibujarCamino(){
        return this.estadoLapiz.sePuedeDibujarCamino();
    }

}


