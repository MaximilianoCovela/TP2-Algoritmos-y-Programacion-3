package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

/**
 * JavaFX App
 */
public class App extends Application {

    private Tablero tablero;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        stage.setTitle("AlgoBlocks");

        Tablero tablero = new Tablero();
        this.tablero = tablero;

        Pane panelTablero = new Pane();


        panelTablero.setPrefHeight(553.0);
        panelTablero.setPrefWidth(804.0);
        panelTablero.setStyle("-fx-background-color: lightblue");

        Pane panelSectorDibujo = new Pane();
        panelSectorDibujo.setLayoutX(3.0);
        panelSectorDibujo.setLayoutY(4.0);
        panelSectorDibujo.setPrefHeight(491.0);
        panelSectorDibujo.setPrefWidth(375.0);
        panelSectorDibujo.setStyle("-fx-background-color: white");

        /*
        Image background = new Image();
        Image personaje = new Image();

        panelSectorDibujo.getChildren().add(background);
        panelSectorDibujo.getChildren().add(personaje); // para agregar los objetos a los paneles
        */

        ScrollPane panelBloquesDisponibles = new ScrollPane();

        panelBloquesDisponibles.setLayoutX(412.0);
        panelBloquesDisponibles.setLayoutY(25.0);
        String pathDeImagen = "https://p4.wallpaperbetter.com/wallpaper/933/827/743/pokemon-pixel-art-wallpaper-preview.jpg";
        ImageView imagenVistaScrollPanel1 = new ImageView(new Image(pathDeImagen));
        panelBloquesDisponibles.setMaxSize(172, 438);

        panelBloquesDisponibles.setContent(imagenVistaScrollPanel1);
        /*
        Button botonMovimientoArriba = new Button();
        Button botonMovimientoAbajo = new Button();
        Button botonMovimientoDerecha = new Button();
        Button botonMovimientoIzquierda = new Button();
        Button botonMovimientoRepetir2Veces = new Button();
        Button botonMovimientoRepetir3Veces = new Button();



        botonMovimientoArriba.setText("Arriba");
        botonMovimientoAbajo.setText("Abajo");
        botonMovimientoDerecha.setText("Derecha");
        botonMovimientoIzquierda.setText("Izquierda");
        botonMovimientoRepetir2Veces.setText("Repetir 2 veces");
        botonMovimientoRepetir3Veces.setText("Repetir 3 veces");

        panelBloquesDisponibles.getChildren().add(botonMovimientoArriba);
        panelBloquesDisponibles.getChildren().add(botonMovimientoAbajo);
        panelBloquesDisponibles.getChildren().add(botonMovimientoDerecha);
        panelBloquesDisponibles.getChildren().add(botonMovimientoIzquierda);
        panelBloquesDisponibles.getChildren().add(botonMovimientoRepetir2Veces);
        panelBloquesDisponibles.getChildren().add(botonMovimientoRepetir3Veces);
        */

        Button botonPlay = new Button();
        botonPlay.setText("Play");
        botonPlay.setLayoutX(68.0);
        botonPlay.setLayoutY(510.0);
        botonPlay.prefHeight(25.0);
        botonPlay.prefWidth(61.0);

        Button botonReiniciar = new Button();
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.setLayoutX(216.0);
        botonReiniciar.setLayoutY(510.0);

        panelTablero.getChildren().add(botonPlay);
        panelTablero.getChildren().add(botonReiniciar);

        ScrollPane panelBloquesSeleccionados = new ScrollPane();
        panelBloquesSeleccionados.setLayoutX(618.0);
        panelBloquesSeleccionados.setLayoutY(25.0);
        //cambiar la imagen a una que sea el fondo del scrollpanel
        String imagePath = "https://p4.wallpaperbetter.com/wallpaper/933/827/743/pokemon-pixel-art-wallpaper-preview.jpg";
        ImageView imageView = new ImageView(new Image(imagePath));
        panelBloquesSeleccionados.setMaxSize(172, 438);

        panelBloquesSeleccionados.setContent(imageView);

        panelTablero.getChildren().add(panelSectorDibujo);
        panelTablero.getChildren().add(panelBloquesDisponibles);
        panelTablero.getChildren().add(panelBloquesSeleccionados);

        Scene scene = new Scene(panelTablero);

        stage.setScene(scene);

        stage.show();

    }

}