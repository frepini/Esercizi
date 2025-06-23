package exercises.oop.shape;

import java.awt.*;

public interface Movable {
    /**
     * Muove il poligonon nel piano 2D
     * @param movement l'oggetto punto considerato come un vettore di traslazione
     */
    void move(Point movement);
}