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