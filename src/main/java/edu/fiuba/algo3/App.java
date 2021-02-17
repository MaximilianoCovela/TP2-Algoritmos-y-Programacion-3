package edu.fiuba.algo3;

import edu.fiuba.algo3.Vista.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        stage.setTitle("AlgoBlocks");

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