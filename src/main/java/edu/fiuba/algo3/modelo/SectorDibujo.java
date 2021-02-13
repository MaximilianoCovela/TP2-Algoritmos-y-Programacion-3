package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class SectorDibujo {

    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<Dibujo>();

    public ArrayList<Dibujo> mostrarDibujos(){
        return this.listaDeDibujos;
    }


    public void agregarDibujo(Dibujo unDibujo) {
        this.listaDeDibujos.add(unDibujo);
    }
}
