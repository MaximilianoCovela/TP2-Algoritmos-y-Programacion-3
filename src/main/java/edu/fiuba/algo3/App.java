package edu.fiuba.algo3;

import edu.fiuba.algo3.Vista.*;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    private Tablero unTablero = new Tablero();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("AlgoBlocks");

        SectorDibujoView sectorDibujoView = new SectorDibujoView();

        PersonajeView vistaPersonaje = new PersonajeView(sectorDibujoView);

        VboxBotonesSeleccionados vb2 = new VboxBotonesSeleccionados(this.unTablero);

        PanelBloquesSeleccionados panelBloquesSeleccionados = new PanelBloquesSeleccionados(vb2);

        VboxBotonesDisponibles vb = new VboxBotonesDisponibles(vb2, unTablero);

        PanelBloquesDisponibles panelBloquesDisponibles = new PanelBloquesDisponibles(vb);

        unTablero.mostrarSectorDibujo().addObserver(vistaPersonaje);

        PanelTablero panelTablero = new PanelTablero(panelBloquesDisponibles,panelBloquesSeleccionados,
                sectorDibujoView, unTablero, vistaPersonaje, vb.getListaVBox(),vb);

        PanelJuego panelJuego = new PanelJuego(panelTablero, panelBloquesDisponibles,
                panelBloquesSeleccionados, sectorDibujoView);

        Scene scene = new Scene(panelJuego);

        stage.setScene(scene);

        stage.setResizable(false);

        stage.getIcons().add(new Image("https://i.imgur.com/xRLYTnS.png"));

        stage.show();
    }

}