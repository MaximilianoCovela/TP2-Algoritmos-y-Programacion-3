package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonReiniciar;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonReiniciar extends Button implements Observer {


    public BotonReiniciar(Tablero unTablero, VboxBotonesSeleccionados vboxBotones,
                          PersonajeView vistaPersonaje,
                          VboxBotonesDisponibles vbd){
        this.setText("Reiniciar");
        this.setLayoutX(302.0);
        this.setLayoutY(555.0);
        this.setOnAction(new HandlerBotonReiniciar(unTablero, vboxBotones,vistaPersonaje, vbd));


    }

    public void update(Dibujo unDibujo, Boolean unEstado){
        this.setDisable(unEstado);
    }

}
