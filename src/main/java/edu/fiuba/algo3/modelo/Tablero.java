package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList <BloqueMovible> secuenciaAEjecutar;
    private Personaje unPersonaje;

    Tablero(){

        unPersonaje = new Personaje();
        secuenciaAEjecutar = new ArrayList<>();

    }

    public void agregarBloque(BloqueMovible unBloque){

        this.secuenciaAEjecutar.add(unBloque);

    }

    public void quitarBloque (BloqueMovible unBloque){

        if(!this.secuenciaAEjecutar.contains(unBloque)){
            throw new BloqueNoEncontradoException();
        }
        this.secuenciaAEjecutar.remove(unBloque);
    }

    public void reiniciarTablero (){

    }

    public void ejecutarSecuencia (){

        for (BloqueMovible b: secuenciaAEjecutar){
            b.aplicarMovimiento(this.unPersonaje);
        }
        
    }

}
