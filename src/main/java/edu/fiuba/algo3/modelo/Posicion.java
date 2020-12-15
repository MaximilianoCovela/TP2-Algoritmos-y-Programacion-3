package edu.fiuba.algo3.modelo;

public class Posicion {

    private int valorHorizontal = 5;
    private int valorVertical = 5;

    public void setPosicion(int x, int y){

        valorHorizontal = x;
        valorVertical = y;

    }


    public void actualizarPosicion(int posicionHorizontal, int posicionVertical){

        valorHorizontal = valorHorizontal + posicionHorizontal;

        valorVertical = valorVertical + posicionVertical;

    }

}
