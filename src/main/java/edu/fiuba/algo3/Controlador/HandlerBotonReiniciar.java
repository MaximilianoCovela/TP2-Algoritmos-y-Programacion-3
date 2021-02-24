package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonReiniciar implements EventHandler<ActionEvent>{

    private Tablero unTablero;

    public HandlerBotonReiniciar(Tablero unTablero){
        this.unTablero = unTablero;
    }

    public void handle(ActionEvent event) {
        System.out.println("Reiniciar");
        unTablero.reiniciarTablero();
    }

}
