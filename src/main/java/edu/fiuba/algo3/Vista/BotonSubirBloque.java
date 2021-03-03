package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonReiniciar;
import edu.fiuba.algo3.Controlador.HandlerBotonSubirBloque;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Observer;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonSubirBloque extends Button implements Observer {

    public BotonSubirBloque(Tablero unTablero,
                            ArrayList<VBoxBotones> arrayVbox, PanelTablero panelTablero,
                            VboxBotonesDisponibles vboxBotonesDisponibles){
        this.setText("↑");
        this.setLayoutX(905.0);
        this.setLayoutY(232.0);
        this.setOnAction(new HandlerBotonSubirBloque(unTablero, arrayVbox, panelTablero, this,
                         vboxBotonesDisponibles));


    }

    public void update(Dibujo unDibujo, Boolean unEstado){
        this.setDisable(unEstado);
    }


}
