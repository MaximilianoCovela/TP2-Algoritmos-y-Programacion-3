package edu.fiuba.algo3.modelo;

public class BloqueAbajo implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje){

        Movimiento unMovimiento;
        unMovimiento = new MovimientoAbajo();

        unPersonaje.mover(unMovimiento);
    }
}