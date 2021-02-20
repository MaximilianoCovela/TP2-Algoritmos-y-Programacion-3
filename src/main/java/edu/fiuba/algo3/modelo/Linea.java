package edu.fiuba.algo3.modelo;

public class Linea implements Dibujo{

    Posicion posicionInicial;
    Posicion posicionFinal;

    public Linea(Posicion posicionInicial, Posicion posicionFinal){
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public boolean mostrarDibujo(){
        return true;
    }

    public boolean posicionLineaEsIgualA(Posicion unaPosicionInicial,Posicion unaPosicionFinal){
        return (posicionInicial.esIgualA(unaPosicionInicial) && posicionFinal.esIgualA(unaPosicionFinal));
    }

}
