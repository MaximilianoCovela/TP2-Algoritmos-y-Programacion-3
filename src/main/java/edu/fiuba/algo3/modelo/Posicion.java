package edu.fiuba.algo3.modelo;

public class Posicion {

    private int valorHorizontal = 5;
    private int valorVertical = 5;

    public void setPosicion(int x, int y){
        valorHorizontal = x;
        valorVertical = y;
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

        Posicion posicionActualizada = new Posicion();

        posicionActualizada.setPosicion(valorHorizontal,valorVertical);

        return posicionActualizada;

    }

}
