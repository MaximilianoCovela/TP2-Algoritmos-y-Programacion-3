package edu.fiuba.algo3;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private TableroView tableroView;
    private PersonajeView personajeView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("AlgoBlocks");

        Tablero unTablero = new Tablero();
        tableroView = new TableroView(unTablero);

        Personaje unPersonaje = new Personaje();
        personajeView = new PersonajeView(unTablero, unPersonaje);

        PanelSectorDibujo panelSectorDibujo = new PanelSectorDibujo();

        VboxBotonesDisponibles vb = new VboxBotonesDisponibles();

        PanelBloquesDisponibles panelBloquesDisponibles = new PanelBloquesDisponibles(vb);

        VboxBotonesSeleccionados vb2 = new VboxBotonesSeleccionados();

        PanelBloquesSeleccionados panelBloquesSeleccionados = new PanelBloquesSeleccionados(vb2);

        PanelTablero panelTablero = new PanelTablero(panelBloquesDisponibles,panelBloquesSeleccionados, panelSectorDibujo);

        Scene scene = new Scene(panelTablero);

        stage.setScene(scene);

        stage.show();
    }

}