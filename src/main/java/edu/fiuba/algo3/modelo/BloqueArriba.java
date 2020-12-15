package edu.fiuba.algo3.modelo;

public class BloqueArriba implements BloqueMovible{

    public void aplicarMovimiento(Personaje unPersonaje){

        Movimiento unMovimiento;
        unMovimiento = new MovimientoArriba();

        unPersonaje.mover(unMovimiento);
    }
}
