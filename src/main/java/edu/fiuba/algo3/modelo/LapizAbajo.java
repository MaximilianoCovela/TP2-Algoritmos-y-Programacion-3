package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {

    public Figura dibujar(Posicion antiguaPosicion,Posicion nuevaPosicion){
        Dibujo unDibujo = new Linea();
        return (new Figura(antiguaPosicion,nuevaPosicion, unDibujo));
    }

    public boolean sePuedeDibujarCamino(){
        return true;
    }
}
