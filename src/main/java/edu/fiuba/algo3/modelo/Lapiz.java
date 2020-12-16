package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz;
    private Posicion posicionActual;

    public Lapiz(){
        estadoLapiz = new LapizArriba();
        posicionActual = new Posicion();
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

    public void actualizarPosicionLapiz(Posicion posicionNueva){
        this.posicionActual = posicionNueva;
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){

        this.estadoLapiz = unEstadoLapiz;
    }

    public boolean esPosibleDibujarCamino(){

        return this.estadoLapiz.sePuedeDibujarCamino();
    }

    public Posicion getPosicionLapiz(){
        return this.posicionActual;
    }

}


