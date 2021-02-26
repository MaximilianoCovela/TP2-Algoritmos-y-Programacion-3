package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonMovimientoPersonalizado;
import edu.fiuba.algo3.Vista.VboxBotonesDisponibles;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.MovimientoPersonalizado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class HandlerBotonGuardarAlgoritmo implements EventHandler<ActionEvent>{

    private Tablero tablero;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private VboxBotonesSeleccionados vboxBotonesSeleccionados;
    private int index;

    public HandlerBotonGuardarAlgoritmo(Tablero unTablero, VboxBotonesDisponibles vbd, VboxBotonesSeleccionados vbs,
    int index) {
        this.tablero = unTablero;
        this.vboxBotonesDisponibles = vbd;
        this.vboxBotonesSeleccionados = vbs;
        this.index = index;
    }

    public void handle(ActionEvent event) {
        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Nombre del algoritmo");
        tid.setContentText("Por favor introduzca un nombre para el algoritmo");
        Optional<String> texto = tid.showAndWait();
        /*
        Si selecciona Aceptar sin haber ingresado un nombre lanza alerta.
        */
        if (texto.isPresent() && texto.get().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Debe ingresar un nombre para su algoritmo.");
            alert.showAndWait();
        }

        /*
        Si pone un nombre y selecciona aceptar se guarda el algoritmo en un bloque personalizado.
        */
        else if (texto.isPresent()) {
            String nombreIngresado = texto.get();
            MovimientoPersonalizado unMovPersonalizado = new MovimientoPersonalizado();
            unMovPersonalizado.guardarAlgoritmo(this.tablero, nombreIngresado);
            BotonMovimientoPersonalizado botonPersonalizado = new BotonMovimientoPersonalizado(this.vboxBotonesSeleccionados,
                    this.tablero, this.index, this.vboxBotonesDisponibles, nombreIngresado, unMovPersonalizado);
            botonPersonalizado.setText(nombreIngresado);
            int indiceAAgregar = vboxBotonesDisponibles.getChildren().size() - 1;
            vboxBotonesDisponibles.getChildren().add(indiceAAgregar, botonPersonalizado);
            vboxBotonesSeleccionados.vaciarBotonesSeleccionados();
            this.vboxBotonesDisponibles.verificar();
        }
    }
}
