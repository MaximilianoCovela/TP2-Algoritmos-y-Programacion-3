package edu.fiuba.algo3.modelo;

public class Vacio implements Dibujo{

    Posicion nuevaPosicion;

    public Vacio(Posicion nuevaPosicion){
        this.nuevaPosicion = nuevaPosicion;
    }

    public boolean mostrarDibujo() {
        return false;
    }

    public boolean posicionVacioEsIgualA(Posicion unaPosicion){
        return (nuevaPosicion.esIgualA(unaPosicion));
    }

}
