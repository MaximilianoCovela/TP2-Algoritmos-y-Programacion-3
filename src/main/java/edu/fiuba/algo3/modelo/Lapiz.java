package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz;

    public Lapiz(){
        estadoLapiz = new LapizArriba();
    }

    /*
    Dentro del if hay que implementar el dibujar camino.
    */
    public void dibujarCamino(Posicion posicionNueva){
    /*
        if(this.estadoLapiz.sePuedeDibujarCamino()){
            //implementar el dibujar camino
        }
    */
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){

        this.estadoLapiz = unEstadoLapiz;
    }

    public boolean esPosibleDibujarCamino(){

        return this.estadoLapiz.sePuedeDibujarCamino();
    }

}


