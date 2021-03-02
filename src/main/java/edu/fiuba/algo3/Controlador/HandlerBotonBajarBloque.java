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
            int indexBotonABajar = botonSeleccionado.getIndex();


            if(!vBoxActual.getChildren().contains(botonSeleccionado) ||
                    (indexBotonABajar == vBoxActual.getChildren().size()-1)){
                return;
            }

            Boton botonASubir;
            try{
                botonASubir = (Boton) vBoxActual.getChildren().get(indexBotonABajar + 1);

            }catch(Exception e){

                System.out.println("No se puede bajar un botón cuando lo siguiente es una VBox >:V");
                return;

            }

            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su indice antes del swap es : " + indexBotonABajar);

            ObservableList<Node> workingCollection = FXCollections.observableArrayList(vBoxActual.getChildren());
            Collections.swap(workingCollection, indexBotonABajar + 1, indexBotonABajar);
            vBoxActual.getChildren().setAll(workingCollection);

            vBoxActual.actualizarMovimientos(indexBotonABajar,-1);

            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su indice despues del swap es : " + indexBotonABajar);


            int indexBotonSubido = indexBotonABajar + 1;
            int indexBotonBajado = indexBotonABajar;

            botonASubir.setIndex(indexBotonABajar);
            botonSeleccionado.setIndex(indexBotonABajar + 1);

            indexBotonABajar = botonSeleccionado.getIndex();
            System.out.println("Dentro del handlerbotonborrar el boton no es nulo y su  NUEVOOOOOOOO indice es : " + indexBotonABajar);

            this.vboxBotonesDisponibles.cambiarBotonSeleccionado(null);

        }

    }
}
