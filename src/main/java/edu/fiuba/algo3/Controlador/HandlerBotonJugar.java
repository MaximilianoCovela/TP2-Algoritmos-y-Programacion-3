package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.Vista.VboxBotonesSeleccionados;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.List;
import edu.fiuba.algo3.Vista.Boton;
import javafx.scene.Node;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        private PersonajeView Personaje;
        private VboxBotonesSeleccionados botonesSeleccionados;
        private Tablero unTablero;

        public HandlerBotonJugar(VboxBotonesSeleccionados vb2, PersonajeView vistaPersonaje, Tablero unTablero){
            this.botonesSeleccionados = vb2;
            this.Personaje = vistaPersonaje;
            this.unTablero = unTablero;
        }
        public void handle(ActionEvent event) {
            // Acá habría que llamar a ejecutarSecuencia(), hay que ver como pasar el tablero.
            System.out.println("Jugar");
            //ObservableList<Node> botones = botonesSeleccionados.getChildren();
            unTablero.ejecutarSecuencia();
            //botones.forEach(accion -> ((Boton)accion).ejecutarAccion(Personaje));
            //for(int i=0; i < botones.size(); i++){
            //    ((Boton)botones.get(i)).ejecutarAccion(Personaje);
//
           // }
        }
}
