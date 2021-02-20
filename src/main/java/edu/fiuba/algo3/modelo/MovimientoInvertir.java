package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class MovimientoInvertir implements Movimiento{

    private ArrayList<Movimiento> listaDeMovimientos = new ArrayList<>();

    public void agregarMovimiento(Movimiento unMovimiento){
        this.listaDeMovimientos.add(unMovimiento);
    }
    public void aplicarMovimiento(Personaje unPersonaje){
        this.listaDeMovimientos.forEach((movimiento) -> movimiento.invertirMovimiento(unPersonaje));
    }
    public void invertirMovimiento(Personaje unPersonaje){
        this.listaDeMovimientos.forEach((movimiento) -> movimiento.aplicarMovimiento(unPersonaje));
    }

}