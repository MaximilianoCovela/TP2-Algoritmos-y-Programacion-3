package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PersonajeView {

    private int posicionHorizontal;
    private int posicionVertical;
    private ImageView imagenPersonaje;
    private PanelSectorDibujo sectorDibujo;


    public PersonajeView(PanelSectorDibujo panelSectorDibujo) {

        this.posicionHorizontal = 4;
        this.posicionVertical = 4;
        this.imagenPersonaje = new ImageView(new Image("https://i.imgur.com/rcT26Fo.png"));
        this.sectorDibujo = panelSectorDibujo;
        this.sectorDibujo.agregarImagenInicial(imagenPersonaje);
    }

    public void actualizarImagen(Image unaImagen){
        imagenPersonaje.setImage(unaImagen);
    }

    public void actualizarPosicion(int posicionHorizontalNueva, int posicionVerticalNueva){
        // ahora hacemos la suma, despues cuando le pasemos la posicion nueva posta del personaje, simplemente
        // le asignamos la posicion que viene por parametro en x en la posicion de personaje en x y con y
        // lo mismo.

        int posicionActualizadaHorizontal = this.posicionHorizontal + posicionHorizontalNueva;
        int posicionActualizadaVertical = this.posicionVertical + posicionVerticalNueva;

        if ((posicionActualizadaHorizontal >= 0 && posicionActualizadaHorizontal < 9) &&
                (posicionActualizadaVertical < 9 && posicionActualizadaVertical >= 0)){

            this.posicionHorizontal = posicionActualizadaHorizontal;
            this.posicionVertical = posicionActualizadaVertical;

        // crear imagen nueva con ifs seguro si ynueva < yvieja.. bla
        }
        this.sectorDibujo.actualizarVistaPersonajeEnSectorDibujo(this.posicionHorizontal, this.posicionVertical, imagenPersonaje);        }

}
