package edu.fiuba.algo3.modelo;

public class BloqueIzquierda implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje){

        Movimiento unMovimiento;
        unMovimiento = new MovimientoIzquierda();

        unPersonaje.mover(unMovimiento);
    }
}
