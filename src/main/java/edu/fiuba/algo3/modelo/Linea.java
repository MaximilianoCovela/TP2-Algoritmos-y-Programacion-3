package edu.fiuba.algo3.modelo;

public class Linea implements Dibujo{

    Posicion posicionInicial;
    Posicion posicionFinal;

    public Linea(Posicion posicionInicial, Posicion posicionFinal){
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public Posicion getPosicionFinal(){
        Posicion nuevaPosicion = this.posicionFinal;
        System.out.println("Posicion Linea Horizontal:" + nuevaPosicion.getValorHorizontal());
        System.out.println("Posicion Linea Vertical:" + nuevaPosicion.getValorVertical());

        return this.posicionFinal; }

    public boolean mostrarDibujo(){
        return true;
    }

    public boolean posicionLineaEsIgualA(Posicion unaPosicionInicial,Posicion unaPosicionFinal){
        return (posicionInicial.esIgualA(unaPosicionInicial) && posicionFinal.esIgualA(unaPosicionFinal));
    }

}
