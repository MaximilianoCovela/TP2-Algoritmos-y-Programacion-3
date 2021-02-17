package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Tablero;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.geometry.Insets;
import javafx.scene.control.*;

import edu.fiuba.algo3.Vista.BotonMovimientoAbajo;
import edu.fiuba.algo3.Vista.BotonMovimientoArriba;
import edu.fiuba.algo3.Vista.BotonMovimientoDerecha;
import edu.fiuba.algo3.Vista.BotonMovimientoIzquierda;
import edu.fiuba.algo3.Vista.BotonMovimientoInvertir;
import edu.fiuba.algo3.Vista.BotonMovimientoRepetir2Veces;
import edu.fiuba.algo3.Vista.BotonMovimientoRepetir3Veces;
import edu.fiuba.algo3.Vista.BotonMovimientoPersonalizado;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizAbajo;
import edu.fiuba.algo3.Vista.BotonMovimientoLapizArriba;


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

        //Tablero tablero = new Tablero();
        //this.tablero = tablero;

        Pane panelTablero = new Pane();

        panelTablero.setPrefHeight(553.0);
        panelTablero.setPrefWidth(804.0);
        panelTablero.setStyle("-fx-background-color: lightblue");

        Label textoDescriptivoMovimientos = new Label();
        textoDescriptivoMovimientos.setLayoutX(622.0);
        textoDescriptivoMovimientos.setLayoutY(479.0);
        textoDescriptivoMovimientos.prefHeight(63.0);
        textoDescriptivoMovimientos.prefWidth(164.0);
        textoDescriptivoMovimientos.setText("Arrastra tus movimientos aquí");
        textoDescriptivoMovimientos.setEffect(new ColorAdjust(0,0,0.5,0));
                panelTablero.getChildren().add(textoDescriptivoMovimientos);


        Pane panelSectorDibujo = new Pane();
        panelSectorDibujo.setLayoutX(3.0);
        panelSectorDibujo.setLayoutY(4.0);
        panelSectorDibujo.setPrefHeight(491.0);
        panelSectorDibujo.setPrefWidth(375.0);
        panelSectorDibujo.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");

        ImageView imagenVista = new ImageView(new Image("https://i.imgur.com/r0jDjwZ.png"));
        panelSectorDibujo.getChildren().add(imagenVista);

        // VBox
        VBox vb = new VBox();
        vb.setPadding(new Insets(10, 0, 0, 10));
        vb.setSpacing(10);

        // Buttons
        BotonMovimientoArriba btn1 = new BotonMovimientoArriba();
        vb.getChildren().add(btn1);

        BotonMovimientoAbajo btn2 = new BotonMovimientoAbajo();
        vb.getChildren().add(btn2);

        BotonMovimientoDerecha btn3 = new BotonMovimientoDerecha();
        vb.getChildren().add(btn3);

        BotonMovimientoIzquierda btn4 = new BotonMovimientoIzquierda();
        vb.getChildren().add(btn4);

        BotonMovimientoRepetir2Veces btn5 = new BotonMovimientoRepetir2Veces();
        vb.getChildren().add(btn5);

        BotonMovimientoRepetir3Veces btn6 = new BotonMovimientoRepetir3Veces();
        vb.getChildren().add(btn6);

        BotonMovimientoInvertir btn7 = new BotonMovimientoInvertir();
        vb.getChildren().add(btn7);

        BotonMovimientoPersonalizado btn8 = new BotonMovimientoPersonalizado();
        vb.getChildren().add(btn8);

        BotonMovimientoLapizAbajo botonLapizAbajo = new BotonMovimientoLapizAbajo();
        vb.getChildren().add(botonLapizAbajo);

        BotonMovimientoLapizArriba botonLapizArriba = new BotonMovimientoLapizArriba();
        vb.getChildren().add(botonLapizArriba);

        vb.setPrefHeight(438.0);
        vb.setPrefWidth(172);

        ScrollPane panelBloquesDisponibles = new ScrollPane();

        panelBloquesDisponibles.setLayoutX(412.0);
        panelBloquesDisponibles.setLayoutY(25.0);
        //String pathDeImagen = "https://p4.wallpaperbetter.com/wallpaper/933/827/743/pokemon-pixel-art-wallpaper-preview.jpg";
        //ImageView imagenVistaScrollPanel1 = new ImageView(new Image(pathDeImagen));
        //vb.getChildren().addAll(imagenVistaScrollPanel1);

        panelBloquesDisponibles.setMaxSize(172, 438);
        vb.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        //panelBloquesDisponibles.setContent(imagenVistaScrollPanel1);
        panelBloquesDisponibles.setContent(vb);

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
        panelBloquesSeleccionados.setMaxSize(172, 438);
        VBox vb2 = new VBox();
        vb2.setPrefHeight(438.0);
        vb2.setPrefWidth(172);

        vb2.setBackground(new Background(new BackgroundFill(Color.SKYBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        panelBloquesSeleccionados.setContent(vb2);

        panelTablero.getChildren().add(panelSectorDibujo);
        panelTablero.getChildren().add(panelBloquesDisponibles);
        panelTablero.getChildren().add(panelBloquesSeleccionados);

        Scene scene = new Scene(panelTablero);

        stage.setScene(scene);

        stage.show();

    }

}