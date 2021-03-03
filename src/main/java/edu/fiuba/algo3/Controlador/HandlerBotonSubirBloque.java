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

    private final PanelTablero panelTablero;
    private Tablero unTablero;
    private BotonSubirBloque unBotonSubirBloque;
    private VboxBotonesDisponibles vboxBotonesDisponibles;
    private ArrayList<VBoxBotones> listaDeVBox;

    public HandlerBotonSubirBloque(Tablero unTablero, ArrayList<VBoxBotones> arrayVbox,
                                   PanelTablero panelTablero, BotonSubirBloque botonSubirBloque,
                                   VboxBotonesDisponibles vboxBotonesDisponibles) {
        this.vboxBotonesDisponibles = vboxBotonesDisponibles;

        this.listaDeVBox = arrayVbox;
        this.unTablero = unTablero;
        this.panelTablero = panelTablero;
        this.unBotonSubirBloque = botonSubirBloque;

    }

    public void handle(ActionEvent actionEvent) {

        Boton botonSeleccionado = this.vboxBotonesDisponibles.getBotonSeleccionado();

        if(botonSeleccionado != null){

            VBoxBotones vBoxActual = this.listaDeVBox.get(listaDeVBox.size()-1);
            int indexBotonASubir = botonSeleccionado.getIndex();

            if(!vBoxActual.getChildren().contains(botonSeleccionado) || indexBotonASubir == 0){
                return;
            }
            Boton botonAnterior;

            try{
               botonAnterior = (Boton) vBoxActual.getChildren().get(indexBotonASubir - 1);

            }catch(Exception e){

                return;

            }

            ObservableList<Node> workingCollection = FXCollections.observableArrayList(vBoxActual.getChildren());
            Collections.swap(workingCollection, indexBotonASubir - 1, indexBotonASubir);
            vBoxActual.getChildren().setAll(workingCollection);

            vBoxActual.actualizarMovimientos(indexBotonASubir,1);

            int indexBotonSubido = indexBotonASubir - 1;
            int indexBotonBajado = indexBotonASubir;

            botonAnterior.setIndex(indexBotonBajado);
            botonSeleccionado.setIndex(indexBotonSubido);

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(null);

        }

    }
}
