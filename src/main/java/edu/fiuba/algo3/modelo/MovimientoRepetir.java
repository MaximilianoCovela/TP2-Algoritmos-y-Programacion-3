package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class MovimientoRepetir implements Movimiento{

    private int cantidad;

    private ArrayList<Movimiento> listaDeMovimientos = new ArrayList<Movimiento>();

    MovimientoRepetir(int unaCantidad){

        this.cantidad = unaCantidad;

    }

    public void agregarMovimiento(Movimiento unMovimiento){

        this.listaDeMovimientos.add(unMovimiento);

    }

    public void aplicarMovimiento(Personaje unPersonaje){

        for(int i = 0; i < cantidad; i++){

            for (int x = 0; x < this.listaDeMovimientos.size(); x++){

                (this.listaDeMovimientos.get(x)).aplicarMovimiento(unPersonaje);


            }

        }

    }

}
