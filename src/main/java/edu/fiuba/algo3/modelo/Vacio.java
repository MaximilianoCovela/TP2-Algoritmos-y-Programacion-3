package edu.fiuba.algo3.modelo;

public class Vacio implements Dibujo{

    Posicion nuevaPosicion;

    public Vacio(Posicion nuevaPosicion){
        this.nuevaPosicion = nuevaPosicion;
    }

    public boolean mostrarDibujo() {
        return false;
    }
    public Posicion getPosicionFinal(){ return this.nuevaPosicion; }
    public boolean posicionVacioEsIgualA(Posicion unaPosicion){
        return (nuevaPosicion.esIgualA(unaPosicion));
    }

}
