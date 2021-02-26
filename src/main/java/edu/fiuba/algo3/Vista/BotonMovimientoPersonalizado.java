package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.HandlerBotonMovimientoPersonalizado;
import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.control.Button;

public class BotonMovimientoPersonalizado extends Button {

    public BotonMovimientoPersonalizado(VboxBotonesSeleccionados vboxbotonesseleccionados,
                                        Tablero unTablero, int index, VboxBotonesDisponibles vbd, String nombre,
                                        MovimientoPersonalizado unMovPersonalizado){
        super();
        this.setText(nombre);
        this.setPrefHeight(70.0);
        this.setPrefWidth(140.0);
        this.setOnAction(new HandlerBotonMovimientoPersonalizado(vboxbotonesseleccionados, unTablero, this,
        index, vbd, nombre, unMovPersonalizado));
    }
}
