package edu.fiuba.algo3.modelo;

public class Posicion {

    private int valorHorizontal;
    private int valorVertical;

    public Posicion(){
        this.valorHorizontal = 5;
        this.valorVertical = 5;
    }

    public Posicion(int posicionHorizontal, int posicionVertical){
        this.valorHorizontal = posicionHorizontal;
        this.valorVertical = posicionVertical;
    }

    public int getValorHorizontal(){
        return this.valorHorizontal;
    }

    public int getValorVertical(){
        return this.valorVertical;
    }

    public boolean esIgualA(Posicion unaPosicion) {
        return unaPosicion.getValorVertical() == this.valorVertical && unaPosicion.getValorHorizontal() == this.valorHorizontal;
    }

    public Posicion actualizarPosicion(Posicion unaPosicionNueva){
        valorHorizontal = valorHorizontal + unaPosicionNueva.getValorHorizontal();
        valorVertical = valorVertical + unaPosicionNueva.getValorVertical();
        Posicion posicionActualizada = new Posicion(valorHorizontal,valorVertical);
        return posicionActualizada;
    }

}
