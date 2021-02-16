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
import javafx.scene.layout.GridPane;
import java.io.FileInputStream;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


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

        Pane panelSectorDibujo = new Pane();
        panelSectorDibujo.setLayoutX(3.0);
        panelSectorDibujo.setLayoutY(4.0);
        panelSectorDibujo.setPrefHeight(491.0);
        panelSectorDibujo.setPrefWidth(375.0);
        panelSectorDibujo.setStyle("-fx-background-color: linear-gradient(to bottom right, derive(skyblue, 20%), derive(palegreen, -40%));");

        //Image background = new Image();
        //panelSectorDibujo.getChildren().add(background);
        ImageView imagenVista = new ImageView(new Image("https://i.imgur.com/r0jDjwZ.png"));
        panelSectorDibujo.getChildren().add(imagenVista);

        // VBox
        VBox vb = new VBox();
        vb.setPadding(new Insets(10, 50, 50, 50));
        vb.setSpacing(10);

        Label lbl = new Label("Bloques");
        lbl.setFont(Font.font("Amble CN", FontWeight.BOLD, 24));
        vb.getChildren().add(lbl);

        // Buttons
        Button btn1 = new Button();
        btn1.setText("Arriba");
        vb.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("Abajo");
        vb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("Derecha");
        vb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Izquierda");
        vb.getChildren().add(btn4);

        Button btn5 = new Button();
        btn5.setText("Repetir2");
        vb.getChildren().add(btn5);

        Button btn6 = new Button();
        btn6.setText("Repetir3");
        vb.getChildren().add(btn6);

        Button btn7 = new Button();
        btn7.setText("Invertir");
        vb.getChildren().add(btn7);

        Button btn8 = new Button();
        btn8.setText("Personalizado");
        vb.getChildren().add(btn8);

        vb.setPrefHeight(438.0);
        vb.setPrefWidth(172);

        ScrollPane panelBloquesDisponibles = new ScrollPane();

        panelBloquesDisponibles.setLayoutX(412.0);
        panelBloquesDisponibles.setLayoutY(25.0);
        String pathDeImagen = "https://p4.wallpaperbetter.com/wallpaper/933/827/743/pokemon-pixel-art-wallpaper-preview.jpg";
        ImageView imagenVistaScrollPanel1 = new ImageView(new Image(pathDeImagen));
        panelBloquesDisponibles.setMaxSize(172, 438);

        panelBloquesDisponibles.setContent(imagenVistaScrollPanel1);
        panelBloquesDisponibles.setContent(vb);

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
        //String imagePath = "https://p4.wallpaperbetter.com/wallpaper/933/827/743/pokemon-pixel-art-wallpaper-preview.jpg";
        //ImageView imageView = new ImageView(new Image(imagePath));
        panelBloquesSeleccionados.setMaxSize(172, 438);
        VBox vb2 = new VBox();
        vb2.setPrefHeight(438.0);
        vb2.setPrefWidth(172);
        panelBloquesSeleccionados.setContent(vb2);

        panelTablero.getChildren().add(panelSectorDibujo);
        panelTablero.getChildren().add(panelBloquesDisponibles);
        panelTablero.getChildren().add(panelBloquesSeleccionados);


        Scene scene = new Scene(panelTablero);

        stage.setScene(scene);

        stage.show();

    }

}