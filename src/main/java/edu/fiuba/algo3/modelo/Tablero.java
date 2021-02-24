package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {

    private ArrayList <Bloque> secuenciaAEjecutar = new ArrayList<>();
    private Personaje unPersonaje;
    private SectorDibujo sectorDibujo = new SectorDibujo();

    public Tablero(){
        this.unPersonaje = new Personaje();
    }

    public Tablero(Personaje unPersonaje){
        this.unPersonaje = unPersonaje;
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
        this.unPersonaje.obtenerDibujos().clear();
        this.unPersonaje.reiniciarPosicion();
        ejecutarSecuencia();
    }

    public void ejecutarSecuencia (){
        this.unPersonaje.reiniciarPosicion();
        for (Bloque b: secuenciaAEjecutar) {
            b.aplicarMovimiento(this.unPersonaje);
        }
        this.sectorDibujo.actualizarDibujos(this.unPersonaje.obtenerDibujos());
        this.sectorDibujo.ejecutarMovimientosDelPersonaje(unPersonaje);
    }

    public Personaje getPersonaje(){
        return unPersonaje;
    }

    public SectorDibujo mostrarSectorDibujo(){
        return this.sectorDibujo;
    }

    public ArrayList<Bloque> getSecuencia(){
        return this.secuenciaAEjecutar;
    }

}
