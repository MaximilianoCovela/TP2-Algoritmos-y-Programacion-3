package edu.fiuba.algo3.modelo;

public class LapizAbajo implements EstadoLapiz {

    public Figura dibujar(Posicion unaPosicion){
        Dibujo unDibujo = new Linea();
        return (new Figura(unaPosicion, unDibujo));
    }

    public boolean sePuedeDibujarCamino(){
        return true;
    }
}
