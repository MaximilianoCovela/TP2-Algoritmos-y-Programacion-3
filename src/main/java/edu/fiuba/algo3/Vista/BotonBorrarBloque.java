package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonBorrarBloque;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonBorrarBloque extends Button {

    public BotonBorrarBloque(VBoxBotones vBoxActual, Tablero unTablero,
                             ArrayList<VBoxBotones> arrayVbox, PanelTablero panelTablero, Boton botonSeleccionado,
                             VboxBotonesDisponibles vboxBotonesDisponibles){
        super();
        this.setText("X");
        this.setLayoutX(905.0); // 921.0
        this.setLayoutY(450.0);
        this.setOnAction(new HandlerBotonBorrarBloque(vBoxActual, unTablero, arrayVbox, botonSeleccionado, panelTablero, this,
                 vboxBotonesDisponibles));


    }
}
