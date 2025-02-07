package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList <Bloque> secuenciaAEjecutar;
    private Personaje unPersonaje;
    private SectorDibujo sectorDibujo;

    public Tablero(){

        unPersonaje = new Personaje();
        secuenciaAEjecutar = new ArrayList<>();
        sectorDibujo = new SectorDibujo();
    }

    public void agregarBloque(Bloque unBloque){

        this.secuenciaAEjecutar.add(unBloque);

    }

    public void quitarBloque (Bloque unBloque){

        if(!this.secuenciaAEjecutar.contains(unBloque)){
            throw new BloqueNoEncontradoException();
        }
        this.secuenciaAEjecutar.remove(unBloque);
    }

    public void reiniciarTablero (){
        this.secuenciaAEjecutar.clear();
    }


    public void ejecutarSecuencia (){

        for (Bloque b: secuenciaAEjecutar){
            b.aplicarMovimiento(this.unPersonaje);
        }
        this.sectorDibujo.agregarDibujos(this.unPersonaje.obtenerDibujos());
    }

    public Personaje getPersonaje(){
        return unPersonaje;
    }

    public SectorDibujo mostrarSectorDibujo(){
        return this.sectorDibujo;
    }

}
