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
    public void actualizarPosicion(Posicion unaPosicion){
        /*
        unMovimiento.modificarAPosicionSiguiente(this.posicionActual);
        this.lapiz.dibujarCamino(this.posicionActual);
        */

        // recibe una posicion que tiene 1 0 o 0 1 y bla. y le suma en actualizar posicion la posicion anterior,
        // que tenia almacenada el personaje. Así se usa la posicion que creamos en movimiento y gg, la anterior
        // queda guardada en la matriz de después.

        unaPosicion.actualizarPosicion(this.posicionActual.getValorHorizontal(),
                this.posicionActual.getValorVertical());

        posicionActual = unaPosicion;

        // y aca en algun momento tengo que llamar a guardar posicion actual en la matriz, cuando exista supongo xd
        // eso equivaldria a un dibujar en el lapiz seria un marcar posicion actual, pasarle eso al lapiz,
        // y que el lapiz delegue eso en una matriz. no se como hacerlooooooo
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
