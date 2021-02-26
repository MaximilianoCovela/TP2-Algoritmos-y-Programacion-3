package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoRepetir2Veces extends Button {

    public BotonMovimientoRepetir2Veces(VboxBotonesSeleccionados vboxbotonesseleccionados, Tablero unTablero,
                                        int index, VboxBotonesDisponibles vbd){
        super();
        this.setText("Repetir x2");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoRepetir2Veces(vboxbotonesseleccionados, unTablero, this, index, vbd));
    }
}
