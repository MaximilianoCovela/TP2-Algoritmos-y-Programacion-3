package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.Movimiento;
import edu.fiuba.algo3.modelo.MovimientoRepetir;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.geometry.Insets;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class VBoxMovimientoRepetir2Veces extends VBoxBotones {

    private Tablero tablero;

    public VBoxMovimientoRepetir2Veces(Tablero unTablero){

        this.setPadding(new Insets(10, 0, 10, 10));
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        this.tablero = unTablero;

    }

    private MovimientoRepetir movimientoRepetir = new MovimientoRepetir(2);

    public void guardarMovimiento(Movimiento unMovimiento){

        movimientoRepetir.agregarMovimiento(unMovimiento);

    }

    public void agregarBloqueATablero() {

        Bloque unBloqueNuevo = new Bloque(this.movimientoRepetir);

        this.tablero.agregarBloque(unBloqueNuevo);

    }

    public Movimiento devolverMovimientos(){
        return this.movimientoRepetir;
    }


    public void actualizarVista(int index){

        while(index < this.getChildren().size()){
            this.getChildren().remove(index);
        }
    }

    public void eliminarMovimiento(int index){

        this.movimientoRepetir.quitarMovimientos(index);

    }

    public void actualizarMovimientos(int index, int i) {
        this.movimientoRepetir.swapMovimientos(index,i);
    }
}
