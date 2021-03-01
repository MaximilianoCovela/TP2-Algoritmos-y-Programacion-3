package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class HandlerBotonBorrarBloque implements EventHandler<ActionEvent> {

    private Boton botonSeleccionado;
    private final PanelTablero panelTablero;
    private VBoxBotones vBoxActual;
    private Tablero unTablero;
    private BotonBorrarBloque unBotonBorrarBloque;
    private VboxBotonesDisponibles vboxBotonesDisponibles;

    private ArrayList<VBoxBotones> listaDeVBox;

    // esto es lo que vamos a empezar a hacer

    public HandlerBotonBorrarBloque(VBoxBotones vBoxBotones,
            Tablero unTablero, ArrayList<VBoxBotones> arrayVbox, Boton botonSeleccionado,
                                    PanelTablero panelTablero, BotonBorrarBloque botonBorrarBloque,
                                    VboxBotonesDisponibles vboxBotonesDisponibles) {
        this.vboxBotonesDisponibles = vboxBotonesDisponibles;

        this.listaDeVBox = arrayVbox;
        this.unTablero = unTablero;
        this.botonSeleccionado = botonSeleccionado;
        this.vBoxActual = vBoxBotones; // usar la del array mejor xd
        this.panelTablero = panelTablero;
        this.unBotonBorrarBloque = botonBorrarBloque;

     }


    public void handle(ActionEvent event) {

        Boton botonSeleccionado = this.vboxBotonesDisponibles.getBotonSeleccionado();

        if(botonSeleccionado == null){
             System.out.println("Aun es nulo el puntero al botón");
            return; //para no dejarlo vacio

        } else {

            int indexBotonABorrar = botonSeleccionado.getIndex();
            System.out.println("Indice del boton que quiero borrar: " +indexBotonABorrar);
            this.vBoxActual.getChildren().remove(botonSeleccionado.getButton());
            this.vBoxActual.actualizarVista(indexBotonABorrar);
            this.unTablero.eliminarBloques(indexBotonABorrar);
            System.out.println("jamas entra aca");
            this.botonSeleccionado = null;

        }

    }
}
