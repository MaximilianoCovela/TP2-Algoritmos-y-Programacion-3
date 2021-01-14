package edu.fiuba.algo3.modelo;

public class Personaje {

    private Posicion posicionActual;
    private Lapiz lapiz ;

    public Personaje(){
        posicionActual = new Posicion();
        lapiz = new Lapiz();
    }

    public Posicion getPosicionActual() {
        return posicionActual;

    }
// recibia un movimiento en lo que hicieron masi y nico
    public void actualizarPosicion(Posicion unaPosicion){ // la del 0 1 y bla

        // primero guardamos la posicion anterior en el array. la actual posicionActual



        posicionActual = posicionActual.actualizarPosicion(unaPosicion); // esto no esta chequeado



    }

    public void modificarEstadoLapiz(EstadoLapiz unEstadoLapiz) {
        this.lapiz.modificarEstadoLapiz(unEstadoLapiz);
    }

    public Lapiz getLapiz(){
        return this.lapiz;
    }

    public boolean enPosicion(Posicion unaPosicion){
        return this.posicionActual.esIgualA(unaPosicion);
    }

}
