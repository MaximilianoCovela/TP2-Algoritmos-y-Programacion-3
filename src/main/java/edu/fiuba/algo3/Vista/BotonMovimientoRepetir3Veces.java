package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir3Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoRepetir3Veces extends Button {

    public BotonMovimientoRepetir3Veces(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero,
                                        int index, VboxBotonesDisponibles vbd){
        super();
        this.setText("Repetir x3");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoRepetir3Veces(vboxbotonesseleccionados, unTablero, this, index, vbd));
    }
}
