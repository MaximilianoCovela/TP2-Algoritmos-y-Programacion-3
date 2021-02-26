package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class MovimientoPersonalizado implements Movimiento {

    private ArrayList<Movimiento> listaDeMovimientos = new ArrayList<>();
    private String nombreAlgoritmo;

    public void agregarMovimiento(Movimiento unMovimiento){
        this.listaDeMovimientos.add(unMovimiento);
    }

    public void aplicarMovimiento(Personaje unPersonaje){
        System.out.println("ESTOY EN APLICAR MOV PERSONALIZADO");
        this.listaDeMovimientos.forEach((movimiento) -> movimiento.aplicarMovimiento(unPersonaje));
    }

    public void invertirMovimiento(Personaje unPersonaje){
        this.listaDeMovimientos.forEach((movimiento) -> movimiento.invertirMovimiento(unPersonaje));
    }

    /*
    Se llama a esta función cuando se apreta botón "Guardar algoritmo" en la interfaz.
    */
    public void guardarAlgoritmo(Tablero tablero, String unNombre){
        this.nombreAlgoritmo = unNombre;
        tablero.getSecuencia().forEach((bloque) -> this.listaDeMovimientos.add(bloque.getMovimiento()));
        System.out.println("Cantidad: " + listaDeMovimientos.size());
        tablero.reiniciarTablero();
    }

}