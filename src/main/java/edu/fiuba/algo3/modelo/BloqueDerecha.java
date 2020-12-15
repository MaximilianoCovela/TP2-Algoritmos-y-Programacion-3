package edu.fiuba.algo3.modelo;

public class BloqueDerecha implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje) {

        Movimiento unMovimiento;
        unMovimiento = new MovimientoDerecha();

        unPersonaje.mover(unMovimiento);

    }
}

