package exercises.oop.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

public class Polygon {
    private Point2D.Double[] vertices;

    /**
     * Costruttore che crea e inizializza un oggetto di tipo Polygon, controllando che siano passati almeno 3 vertici
     * @param vertices array di oggetti di tipo Point che rappresentano i vertici del poligono
     */
    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("Sono necessari almeno 3 vertici");
        }
        this.vertices = vertices;
    }

    /**
     * Restituisce il numero di vertici del poligono
     * @return il numero di vertici del poligono
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * Restituisce il perimetro del poligono
     * @return il perimetro del poligono
     * @see "https://arachnoid.com/area_irregular_polygon/index.html"
     */
    public double getPerimeter() {
        double perimeter = 0.0;

        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y); // radice della somma dei quadrati dei parametri
        }

        return perimeter;
    }

    /**
     * Restituisce l'area del poligono
     * @return l'area del poligono
     * @see "https://arachnoid.com/area_irregular_polygon/index.html"
     */
    public double getArea() {
        double area = 0.0;

        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }

        return Math.abs(area / 2.0);
    }

    @Override
    public String toString() {
        return "Polygon{vertices=" + Arrays.toString(vertices) + "}";
    }
}