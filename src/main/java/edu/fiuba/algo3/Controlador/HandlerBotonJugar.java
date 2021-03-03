package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.Boton;
import edu.fiuba.algo3.Vista.BotonJugar;
import edu.fiuba.algo3.Vista.BotonReiniciar;
import edu.fiuba.algo3.Vista.PersonajeView;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerBotonJugar implements EventHandler<ActionEvent> {
        private Tablero unTablero;
        private final PersonajeView unavistaPersonaje;
        private BotonJugar unBotonJugar;
        private BotonReiniciar BotonReset;

        public HandlerBotonJugar(Tablero unTablero, PersonajeView vistaPersonaje, BotonJugar unBoton,
                                 BotonReiniciar BtnReset){
            this.unTablero = unTablero;
            this.unavistaPersonaje = vistaPersonaje;
            this.unBotonJugar = unBoton;
            this.BotonReset = BtnReset;
        }
        public void handle(ActionEvent event) {
            this.unavistaPersonaje.reiniciarVistaPersonaje();
           /* this.unBotonJugar.setDisable(true);
            this.BotonReset.setDisable(true);*/
            unTablero.ejecutarSecuencia();
        }
}
