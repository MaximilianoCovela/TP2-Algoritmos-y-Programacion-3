package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.BotonEjecutarEventHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
/*    public void start(Stage stage) {
        stage.setTitle("Mi primer ventana");
        Canvas canvas = new Canvas( 200, 150);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Button botonEjecutar = new Button();
        botonEjecutar.setText("Ejecutar");
        Button botonTerminar = new Button();
        botonTerminar.setText("Terminar");
        HBox contenedorHorizontal = new HBox(botonEjecutar, botonTerminar);
        contenedorHorizontal.setSpacing(10);
        contenedorHorizontal.setPadding(new Insets(20));
        contenedorHorizontal.setTranslateY(400);
        VBox contenedorPrincipal = new VBox(canvas, contenedorHorizontal);
        BotonEjecutarEventHandler botonEjecutarEventHandler = new BotonEjecutarEventHandler();
        botonEjecutar.setOnAction(botonEjecutarEventHandler);

        Scene scene = new Scene(contenedorPrincipal, 600, 400, Color.BLACK);
        stage.setScene(scene);

        stage.show();
    }*/

    public void start(Stage stage) {
        stage.setTitle("Mi primer ventana");
        Group root = new Group();
        Canvas canvas = new Canvas(250,350);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);
        stage.setScene(scene);
        stage.show();
        gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setLineWidth(5);
        gc.setFill(Color.GREEN);
        Button botonEjecutar = new Button();
        botonEjecutar.setText("Ejecutar");
        Button botonTerminar = new Button();
        botonTerminar.setText("Terminar");
        HBox contenedorHorizontal = new HBox(botonEjecutar, botonTerminar);
        contenedorHorizontal.setSpacing(10);
        contenedorHorizontal.setPadding(new Insets(20));
        contenedorHorizontal.setTranslateY(350);
        root.getChildren().add(contenedorHorizontal);
    }

    public static void main(String[] args) {
        launch();
    }

}