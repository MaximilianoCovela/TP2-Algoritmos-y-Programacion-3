package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MovimientoRepetir implements Movimiento{

    private final int cantidad;

    private ArrayList<Movimiento> listaDeMovimientos = new ArrayList<>();

    public MovimientoRepetir(int unaCantidad){
        this.cantidad = unaCantidad;
    }

    public void agregarMovimiento(Movimiento unMovimiento){
        this.listaDeMovimientos.add(unMovimiento);
    }

    public void aplicarMovimiento(Personaje unPersonaje){
        IntStream.range(0, cantidad).flatMap(i -> IntStream.range(0, this.listaDeMovimientos.size())).
                forEach(x -> (this.listaDeMovimientos.get(x)).aplicarMovimiento(unPersonaje));
    }

    public void invertirMovimiento(Personaje unPersonaje){
        IntStream.range(0, cantidad).flatMap(i -> IntStream.range(0, this.listaDeMovimientos.size())).
                forEach(x -> (this.listaDeMovimientos.get(x)).invertirMovimiento(unPersonaje));
    }

    public void quitarMovimientos(int index) {

        while(index < this.listaDeMovimientos.size()) {
            this.listaDeMovimientos.remove(index);
        }
    }

    public void swapMovimientos(int index, int numero){
        Movimiento primerMovimiento;
        Movimiento segundoMovimiento;

        if(numero == 1){
            segundoMovimiento = this.listaDeMovimientos.get(index);
            primerMovimiento = this.listaDeMovimientos.get(index - 1);

            this.listaDeMovimientos.remove(index);
            this.listaDeMovimientos.remove(index - 1);

            this.listaDeMovimientos.add(index - 1,segundoMovimiento);
            this.listaDeMovimientos.add(index ,primerMovimiento);

        }else{

        }
    }

}