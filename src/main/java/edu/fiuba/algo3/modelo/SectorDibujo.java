package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class SectorDibujo {

    private ArrayList<Figura> listaDeFiguras = new ArrayList<Figura>();

    public void agregarFigura(Figura unaFigura){
        this.listaDeFiguras.add(unaFigura);
    }

    public ArrayList<Figura> mostrarFiguras(){
        return this.listaDeFiguras;
    }



}
