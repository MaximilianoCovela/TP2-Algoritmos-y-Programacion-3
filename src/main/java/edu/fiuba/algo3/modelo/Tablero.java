package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList <BloqueMovible> secuenciaAEjecutar;
    private Personaje unPersonaje;

    public void agregarBloque(BloqueMovible unBloque ){

        this.secuenciaAEjecutar.add(unBloque);

    }
}
