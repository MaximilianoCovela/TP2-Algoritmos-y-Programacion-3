package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonJugar;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Observer;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Tablero;

public class BotonJugar extends Button implements Observer{
    private  BotonReiniciar BotonReset;
    public BotonJugar(Tablero unTablero, PersonajeView vistaPersonaje, BotonReiniciar BtnReiniciar){
        this.setText("Ejecutar");
        this.setLayoutX(118.0);
        this.setLayoutY(555.0);
        this.prefHeight(25.0);
        this.prefWidth(61.0);
        this.BotonReset = BtnReiniciar;
        this.setOnAction(new HandlerBotonJugar(unTablero, vistaPersonaje,this,this.BotonReset));

    }

    public void update(Dibujo unDibujo, Boolean unEstado){
        this.setDisable(unEstado);

        System.out.println("El estado actual del boton es: " + unEstado);
    }

}
