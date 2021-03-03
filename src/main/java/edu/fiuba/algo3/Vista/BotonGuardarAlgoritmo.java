package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonGuardarAlgoritmo;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class BotonGuardarAlgoritmo extends Button {

    public BotonGuardarAlgoritmo(VboxBotonesSeleccionados vbs, VboxBotonesDisponibles vbd, Tablero unTablero,
                                 int index, ArrayList<VBoxBotones> listaDeVbox) {
        super();
        this.setText("Guardar algoritmo");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonGuardarAlgoritmo(unTablero, vbd, vbs, index, listaDeVbox));
    }

}
