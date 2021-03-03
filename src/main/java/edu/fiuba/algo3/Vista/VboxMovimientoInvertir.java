package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class VboxMovimientoInvertir extends VBoxBotones {

    private Tablero tablero;

    public VboxMovimientoInvertir(Tablero unTablero){

        this.setPadding(new Insets(10, 0, 10, 10));
        this.setSpacing(5);
        this.setBackground(new Background(new BackgroundFill(Color.HOTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        this.tablero = unTablero;
    }

    private MovimientoInvertir movimientoInvertir = new MovimientoInvertir();

    public void guardarMovimiento(Movimiento unMovimiento){

        movimientoInvertir.agregarMovimiento(unMovimiento);

    }

    public void agregarBloqueATablero() {

        Bloque unBloqueNuevo = new Bloque(this.movimientoInvertir);

        this.tablero.agregarBloque(unBloqueNuevo);

    }

    public Movimiento devolverMovimientos(){
        return this.movimientoInvertir;
    }


    public void actualizarVista(int index){
        while(index < this.getChildren().size()){
            this.getChildren().remove(index);
        }
    }

    public void eliminarMovimiento(int index){

        this.movimientoInvertir.quitarMovimientos(index);
    }

    public void actualizarMovimientos(int index, int i) {
        this.movimientoInvertir.swapMovimientos(index,i);
    }

}
