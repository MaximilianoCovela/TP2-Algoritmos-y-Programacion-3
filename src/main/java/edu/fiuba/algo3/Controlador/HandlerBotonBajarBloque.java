package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class HandlerBotonBajarBloque implements EventHandler<ActionEvent> {

    private Boton botonSeleccionado;
    private final PanelTablero panelTablero;
    private VBoxBotones vBoxActual;
    private Tablero unTablero;
    private BotonBajarBloque unBotonBajarBloque;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonBajarBloque(VBoxBotones vBoxBotones,
                                    Tablero unTablero, ArrayList<VBoxBotones> arrayVbox,
                                    PanelTablero panelTablero, BotonBajarBloque botonBajarBloque,
                                    VboxBotonesDisponibles vboxBotonesDisponibles) {
        this.vboxBotonesDisponibles = vboxBotonesDisponibles;

        this.listaDeVBox = arrayVbox;
        this.unTablero = unTablero;
        this.botonSeleccionado = botonSeleccionado;
        this.vBoxActual = vBoxBotones; // usar la del array mejor xd
        this.panelTablero = panelTablero;
        this.unBotonBajarBloque = botonBajarBloque;

    }

    public void handle(ActionEvent actionEvent) {

        Boton botonSeleccionado = this.vboxBotonesDisponibles.getBotonSeleccionado();

        if(botonSeleccionado == null){
            System.out.println("Aun es nulo el puntero al botón");

        } else {
            VBoxBotones vBoxActual = this.listaDeVBox.get(listaDeVBox.size()-1);

            if(!vBoxActual.getChildren().contains(botonSeleccionado)){
                return;
            }

            int indexBotonABorrar = botonSeleccionado.getIndex();
            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su indice es : " +indexBotonABorrar);
            vBoxActual.eliminarMovimiento(indexBotonABorrar);
            vBoxActual.actualizarVista(indexBotonABorrar); //cambie esto recien

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(null);


        }

    }
}
