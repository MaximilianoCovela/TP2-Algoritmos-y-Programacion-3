package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz;

    public Lapiz(){
        estadoLapiz = new LapizArriba();
    }


    public void dibujarCamino(Posicion antiguaPosicion,Posicion nuevaPosicion){
        this.estadoLapiz.dibujar(antiguaPosicion,nuevaPosicion);

    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){

        this.estadoLapiz = unEstadoLapiz;
    }
    public boolean esPosibleDibujarCamino(){

        return this.estadoLapiz.sePuedeDibujarCamino();
    }

}


