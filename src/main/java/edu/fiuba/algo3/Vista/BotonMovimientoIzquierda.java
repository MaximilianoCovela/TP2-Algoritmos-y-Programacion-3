package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoAbajo;
import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoIzquierda extends Button {
    private HandlerBotonMovimientoIzquierda accion;

    public BotonMovimientoIzquierda(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                    Tablero unTablero, int index, VboxBotonesDisponibles vbd){
        super();
        this.setText("Izquierda");
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.accion = new HandlerBotonMovimientoIzquierda(vboxbotonesseleccionados,
                unTablero, this, index, vbd);
        this.setOnAction(accion);
    }

}
