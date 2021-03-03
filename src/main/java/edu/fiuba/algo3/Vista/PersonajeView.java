package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Observer;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Posicion;

public class PersonajeView implements Observer {

    private int posicionHorizontal;
    private int posicionVertical;
    private ImageView imagenPersonaje;
    private SectorDibujoView sectorDibujo;


    public PersonajeView(SectorDibujoView sectorDibujoView) {

        this.posicionHorizontal = 4;
        this.posicionVertical = 4;
        this.imagenPersonaje = new ImageView(new Image("https://i.imgur.com/rcT26Fo.png"));
        imagenPersonaje.toFront();
        this.sectorDibujo = sectorDibujoView;
        this.sectorDibujo.agregarImagenInicial(imagenPersonaje);

    }

    public void reiniciarVistaPersonaje(){

        Posicion posicionInicial = new Posicion();

        this.actualizarImagen(new Image("https://i.imgur.com/rcT26Fo.png"));

        this.sectorDibujo.borrarCaminosRealizados(imagenPersonaje);

        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(posicionInicial.getValorHorizontal(),
                posicionInicial.getValorVertical(),imagenPersonaje);

        this.posicionHorizontal = posicionInicial.getValorHorizontal();
        this.posicionVertical = posicionInicial.getValorVertical();
    }

    public void actualizarImagen(Image unaImagen) {
        imagenPersonaje.setImage(unaImagen);
    }

    @Override
    public void update(Dibujo unDibujo, Boolean unEstado) {

        if(unDibujo == null){
            return;
        }

        Posicion nuevaPosicion = unDibujo.getPosicionFinal();

        if(nuevaPosicion.getValorHorizontal() > this.posicionHorizontal){
            Image imagenDerecha = new Image("https://i.imgur.com/awfzRqc.png");
            this.actualizarImagen(imagenDerecha);
        }else if(nuevaPosicion.getValorHorizontal() < this.posicionHorizontal){
            Image imagenIzquierda = new Image("https://imgur.com/npbSGMe.png");
            this.actualizarImagen(imagenIzquierda);
        }else if(nuevaPosicion.getValorVertical() > this.posicionVertical){
            Image imagenAbajo = new Image("https://i.imgur.com/rcT26Fo.png");
            this.actualizarImagen(imagenAbajo);
        }else if(nuevaPosicion.getValorVertical() < this.posicionVertical){
            Image imagenArriba = new Image("https://i.imgur.com/N3gBRlL.png");
            this.actualizarImagen(imagenArriba);
        }

        this.sectorDibujo.marcarCelda(this.posicionHorizontal, this.posicionVertical,unDibujo);

        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(nuevaPosicion.getValorHorizontal(),
                nuevaPosicion.getValorVertical(),imagenPersonaje);

        this.posicionHorizontal = nuevaPosicion.getValorHorizontal();
        this.posicionVertical = nuevaPosicion.getValorVertical();
        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(this.posicionHorizontal,this.posicionVertical,this.imagenPersonaje);

    }

}

