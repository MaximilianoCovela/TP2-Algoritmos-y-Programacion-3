package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;


public class HandlerBotonMenu implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Menú");
        alert.setHeaderText("Manual de uso ");
       alert.setContentText("Bienvenidos a nuestro juego de bloques AlgoBlocks! \n" +
                "Las siguientes instrucciones deben ser tenidas en cuenta: \n\n"+
                        "♥ Al utilizar algún bloque Repetirx2, Repetirx3 e Invertir, se deben cerrar antes de " +
                        "ejecutar el juego o seguir agregando bloques que no se quieran ya englobar dentro del anterior," +
               " utilizando respectivamente Parar(Repetirx2), etc.\n" +
                "♥ No se puede borrar un bloque Repetirx2, Repetirx3 e Invertir, se debe borrar "+
                "el bloque anterior ingresado, o presionar el botón Reiniciar.\n"+
                "♥ Se pueden mover dos bloques contiguos entre sí, si hay un Bloque complejo arriba no se podrá" +
               "mover el bloque deseado arriba, y lo mismo con mover abajo.\n");

        alert.setResizable(true);
        alert.setHeight(500);
        alert.setWidth(500);
        alert.showAndWait();



    }
}
