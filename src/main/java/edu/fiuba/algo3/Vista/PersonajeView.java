package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Observer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Posicion;
import javafx.util.Duration;

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
    public void update(Dibujo unDibujo) {

    System.out.println("Llegue aca");
    System.out.println("Llegue aca");
    System.out.println("Llegue aca");

        Posicion nuevaPosicion = unDibujo.getPosicionFinal();

        /*
        switch(){
            case(){

            }
            case(){

            }
            case(){

            }
            case(){

            }

        }
        */

        System.out.println("Posicion Horizontal:" + nuevaPosicion.getValorHorizontal());
        System.out.println("Posicion Vertical:" + nuevaPosicion.getValorVertical());

        this.sectorDibujo.marcarCelda(this.posicionHorizontal, this.posicionVertical,unDibujo); // esto lo puede hacer el update de sector dibujo y listo

        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(nuevaPosicion.getValorHorizontal(),
                nuevaPosicion.getValorVertical(),imagenPersonaje);

        this.posicionHorizontal = nuevaPosicion.getValorHorizontal();
        this.posicionVertical = nuevaPosicion.getValorVertical();
    }
}

