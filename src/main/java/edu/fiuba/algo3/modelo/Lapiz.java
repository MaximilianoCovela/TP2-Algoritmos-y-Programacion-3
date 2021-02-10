package edu.fiuba.algo3.modelo;

public class Lapiz {

    private EstadoLapiz estadoLapiz;
    private SectorDibujo sectorDibujo;


    public Lapiz(){
        sectorDibujo = new SectorDibujo();
        estadoLapiz = new LapizArriba();
    }


    public void dibujarCamino(Posicion antiguaPosicion,Posicion nuevaPosicion){
        Figura unaFigura = this.estadoLapiz.dibujar(antiguaPosicion,nuevaPosicion);
        this.sectorDibujo.agregarFigura(unaFigura);
    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz){

        this.estadoLapiz = unEstadoLapiz;
    }
    public boolean esPosibleDibujarCamino(){

        return this.estadoLapiz.sePuedeDibujarCamino();
    }

    public SectorDibujo mostrarSectorDibujo(){
        return this.sectorDibujo;
    }
}


