package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class SectorDibujo {

    private ArrayList<Dibujo> listaDeDibujos = new ArrayList<>();

    public ArrayList<Dibujo> mostrarDibujos(){
        return this.listaDeDibujos;
    }

    public void actualizarDibujos(ArrayList<Dibujo> unaListaDeDibujos) {
        this.listaDeDibujos = unaListaDeDibujos;
    }
}
