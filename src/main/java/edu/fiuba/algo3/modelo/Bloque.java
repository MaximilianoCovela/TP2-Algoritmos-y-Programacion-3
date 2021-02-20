package edu.fiuba.algo3.modelo;

public class Bloque {
    private Movimiento unMovimiento;

    Bloque(Movimiento unTipoMovimiento){
        this.unMovimiento = unTipoMovimiento;
    }

    void aplicarMovimiento(Personaje unPersonaje){
        this.unMovimiento.aplicarMovimiento(unPersonaje);
    }

    public Movimiento getMovimiento() {
        return this.unMovimiento;
    }

}
