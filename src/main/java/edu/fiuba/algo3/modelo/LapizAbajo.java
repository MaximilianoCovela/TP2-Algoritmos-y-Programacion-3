package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {

    public Dibujo dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion){

        Posicion unaPosicionInicial = new Posicion(antiguaPosicion.getValorHorizontal(),antiguaPosicion.getValorVertical());

        Posicion unaPosicionFinal = new Posicion(nuevaPosicion.getValorHorizontal(),nuevaPosicion.getValorVertical());

        return (new Linea(unaPosicionInicial, unaPosicionFinal));
    }

    public boolean sePuedeDibujarCamino(){
        return true;
    }

}
