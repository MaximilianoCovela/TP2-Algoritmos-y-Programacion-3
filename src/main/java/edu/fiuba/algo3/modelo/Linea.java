package edu.fiuba.algo3.modelo;

public class Linea implements Dibujo{

    Posicion nuevaPosicion;
    Posicion antiguaPosicion;

    public Linea(Posicion antiguaPosicion,Posicion nuevaPosicion){
        this.nuevaPosicion = nuevaPosicion;
        this.antiguaPosicion = antiguaPosicion;

    }

    public boolean mostrarDibujo() {
        return true;
    }

}
