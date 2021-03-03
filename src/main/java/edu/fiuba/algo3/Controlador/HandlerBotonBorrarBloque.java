package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class HandlerBotonBorrarBloque implements EventHandler<ActionEvent> {

    private final PanelTablero panelTablero;
    private Tablero unTablero;
    private BotonBorrarBloque unBotonBorrarBloque;
    private VboxBotonesDisponibles vboxBotonesDisponibles;

    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonBorrarBloque(Tablero unTablero, ArrayList<VBoxBotones> arrayVbox,
                                    PanelTablero panelTablero, BotonBorrarBloque botonBorrarBloque,
                                    VboxBotonesDisponibles vboxBotonesDisponibles) {
        this.vboxBotonesDisponibles = vboxBotonesDisponibles;

        this.listaDeVBox = arrayVbox;
        this.unTablero = unTablero;
        this.panelTablero = panelTablero;
        this.unBotonBorrarBloque = botonBorrarBloque;

     }


    public void handle(ActionEvent event) {

        Boton botonSeleccionado = this.vboxBotonesDisponibles.getBotonSeleccionado();

        if(botonSeleccionado != null){

            VBoxBotones vBoxActual = this.listaDeVBox.get(listaDeVBox.size()-1);

            if(!vBoxActual.getChildren().contains(botonSeleccionado)){
                return;
            }

            int indexBotonABorrar = botonSeleccionado.getIndex();

            vBoxActual.eliminarMovimiento(indexBotonABorrar);
            vBoxActual.actualizarVista(indexBotonABorrar);

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(null);


        }
        vboxBotonesDisponibles.verificar();
    }
}
