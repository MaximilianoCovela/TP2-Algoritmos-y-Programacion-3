package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonBajarBloque;
import edu.fiuba.algo3.Controlador.HandlerBotonReiniciar;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonBajarBloque extends Button {

    public BotonBajarBloque(VBoxBotones vBoxActual, Tablero unTablero,
                            ArrayList<VBoxBotones> arrayVbox, PanelTablero panelTablero,
                            VboxBotonesDisponibles vboxBotonesDisponibles){ // despues vemos que necesita recibir
        this.setText("↓");
        this.setLayoutX(905.0); //<Button layoutX="921.0" layoutY="287.0" mnemonicParsing="false" text="↓" />
        this.setLayoutY(287.0);
        this.setOnAction(new HandlerBotonBajarBloque(vBoxActual, unTablero, arrayVbox, panelTablero, this,
                         vboxBotonesDisponibles));

    }


}
