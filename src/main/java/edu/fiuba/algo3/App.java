package edu.fiuba.algo3;

import edu.fiuba.algo3.Vista.*;
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

        PanelSectorDibujo panelSectorDibujo = new PanelSectorDibujo();


        PersonajeView vistaPersonaje = new PersonajeView(panelSectorDibujo);


        VboxBotonesSeleccionados vb2 = new VboxBotonesSeleccionados();

        PanelBloquesSeleccionados panelBloquesSeleccionados = new PanelBloquesSeleccionados(vb2);

        VboxBotonesDisponibles vb = new VboxBotonesDisponibles(vb2, vistaPersonaje);

        PanelBloquesDisponibles panelBloquesDisponibles = new PanelBloquesDisponibles(vb);

        PanelTablero panelTablero = new PanelTablero(panelBloquesDisponibles,panelBloquesSeleccionados, panelSectorDibujo);

        PanelJuego panelJuego = new PanelJuego(panelTablero, panelBloquesDisponibles, panelBloquesSeleccionados, panelSectorDibujo);

        Scene scene = new Scene(panelJuego);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

}