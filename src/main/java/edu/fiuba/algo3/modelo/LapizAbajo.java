package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {

    public Dibujo dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion){

        return (new Linea(antiguaPosicion,nuevaPosicion));

    }

    public boolean sePuedeDibujarCamino(){
        return true;
    }
}
