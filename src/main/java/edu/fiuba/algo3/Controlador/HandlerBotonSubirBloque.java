package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.Collections;

public class HandlerBotonSubirBloque implements EventHandler<ActionEvent> {

    private Boton botonSeleccionado;
    private final PanelTablero panelTablero;
    private VBoxBotones vBoxActual;
    private Tablero unTablero;
    private BotonSubirBloque unBotonSubirBloque;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonSubirBloque(VBoxBotones vBoxBotones,
                                   Tablero unTablero, ArrayList<VBoxBotones> arrayVbox,
                                   PanelTablero panelTablero, BotonSubirBloque botonSubirBloque,
                                   VboxBotonesDisponibles vboxBotonesDisponibles) {
        this.vboxBotonesDisponibles = vboxBotonesDisponibles;

        this.listaDeVBox = arrayVbox;
        this.unTablero = unTablero;
        this.botonSeleccionado = botonSeleccionado;
        this.vBoxActual = vBoxBotones; // usar la del array mejor xd
        this.panelTablero = panelTablero;
        this.unBotonSubirBloque = botonSubirBloque;

    }

    public void handle(ActionEvent actionEvent) {

        Boton botonSeleccionado = this.vboxBotonesDisponibles.getBotonSeleccionado();

        if(botonSeleccionado == null){
            System.out.println("Aun es nulo el puntero al botón");

        } else {
            VBoxBotones vBoxActual = this.listaDeVBox.get(listaDeVBox.size()-1);
            int indexBotonASubir = botonSeleccionado.getIndex();

            if(!vBoxActual.getChildren().contains(botonSeleccionado) || indexBotonASubir == 0){
                return;
            }

            Boton botonAnterior = (Boton) vBoxActual.getChildren().get(indexBotonASubir - 1);

            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su indice antes del swap es : " + indexBotonASubir);

            ObservableList<Node> workingCollection = FXCollections.observableArrayList(vBoxActual.getChildren());
            Collections.swap(workingCollection, indexBotonASubir - 1, indexBotonASubir);
            vBoxActual.getChildren().setAll(workingCollection);

            vBoxActual.actualizarMovimientos(indexBotonASubir,1);

            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su indice despues del swap es : " + indexBotonASubir);


            int indexBotonSubido = indexBotonASubir - 1;
            int indexBotonBajado = indexBotonASubir;

            botonAnterior.setIndex(indexBotonBajado);
            botonSeleccionado.setIndex(indexBotonSubido);

            indexBotonASubir = botonSeleccionado.getIndex();
            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su  NUEVOOOOOOOO indice es : " + indexBotonASubir);

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(null);

        }

    }
}
