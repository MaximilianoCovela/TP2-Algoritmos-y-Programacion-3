package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.stream.IntStream;

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

        IntStream.range(0, cantidad).flatMap(i -> IntStream.range(0, this.listaDeMovimientos.size())).
                forEach(x -> (this.listaDeMovimientos.get(x)).aplicarMovimiento(unPersonaje));

    }

}
