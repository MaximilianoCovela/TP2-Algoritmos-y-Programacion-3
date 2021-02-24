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
        this.sectorDibujo = sectorDibujoView;
        this.sectorDibujo.agregarImagenInicial(imagenPersonaje);
    }

    public void actualizarImagen(Image unaImagen) {
        imagenPersonaje.setImage(unaImagen);
    }

    public void actualizarPosicion(int posicionHorizontalNueva, int posicionVerticalNueva) {
        // ahora hacemos la suma, despues cuando le pasemos la posicion nueva posta del personaje, simplemente
        // le asignamos la posicion que viene por parametro en x en la posicion de personaje en x y con y
        // lo mismo.

        //int posicionActH = this.posicionHorizontal; + posicionHorizontalNueva;
        //int posicionActV = this.posicionVertical; + posicionVerticalNueva;

        //if ((posicionActH >= 0 && posicionActH < 9) &&
         //       (posicionActV < 9 && posicionActV >= 0)) {

         //   this.posicionHorizontal = posicionActH;
         //   this.posicionVertical = posicionActV;

            // crear imagen nueva con ifs seguro si ynueva < yvieja.. bla
        //}

       // this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(posicionHorizontalNueva,
   // posicionVerticalNueva, imagenPersonaje);
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
        /*
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(7), actionEvent -> {
            System.out.println("Ya terminó de actualizar");
            this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(nuevaPosicion.getValorHorizontal(),
                    nuevaPosicion.getValorVertical(),imagenPersonaje);
        }));
        timeline.play();
        */

        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(nuevaPosicion.getValorHorizontal(),
                nuevaPosicion.getValorVertical(),imagenPersonaje);

        //actualizarPosicion(nuevaPosicion.getValorHorizontal(), nuevaPosicion.getValorVertical());
    }
}

