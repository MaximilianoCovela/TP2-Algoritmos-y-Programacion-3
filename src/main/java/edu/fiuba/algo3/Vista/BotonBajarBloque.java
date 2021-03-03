package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonBajarBloque;
import edu.fiuba.algo3.Controlador.HandlerBotonReiniciar;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonBajarBloque extends Button implements Observer {

    public BotonBajarBloque(Tablero unTablero,
                            ArrayList<VBoxBotones> arrayVbox, PanelTablero panelTablero,
                            VboxBotonesDisponibles vboxBotonesDisponibles){
        this.setText("↓");
        this.setLayoutX(905.0);
        this.setLayoutY(287.0);
        this.setOnAction(new HandlerBotonBajarBloque(unTablero, arrayVbox, panelTablero, this,
                         vboxBotonesDisponibles));

    }

    public void update(Dibujo unDibujo, Boolean unEstado){
        this.setDisable(unEstado);
    }

}
