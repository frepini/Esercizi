package exercises.oop_old.basic;

import java.awt.geom.Point2D;
import java.util.Arrays;

/*
Write a class named Polygon representing an irregular polygon. Internally, the class uses a Point[] for representing the
vertices of the polygon. The class provides the following methods:

- public Polygon(Point2D.Double[] vertices) creating the polygon.
- public int getVerticesCount() returning the number of vertices.
- public double getPerimeter() returning the perimeter of the polygon.
- public double getArea() returning the area of the polygon.
- public String toString().
Polygons must have at least three vertices.
 */

public class Polygon {
    private final Point2D.Double[] vertices;

    public Polygon(Point2D.Double[] vertices) {
        if(vertices.length < 3) {
            throw new IllegalArgumentException("Almeno 3 vertici");
        }
        this.vertices = vertices;
    }

    /**
     * Metodo che restituisce il numero di vertici
     * @return numero di vertici
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * Metodo che restituisce il perimetro del poligono
     * @return perimetro del poligono
     */
    public double getPerimeter() {
        double perimeter = 0.0;
        for(int i = 0; i < vertices.length - 1; i++) {
            perimeter += Point2D.Double.distance(vertices[i].x, vertices[i].y, vertices[i + 1].x, vertices[i + 1].y);
        }
        perimeter += Point2D.Double.distance(vertices[vertices.length - 1].x, vertices[vertices.length - 1].y, vertices[0].x, vertices[0].y);
        return perimeter;
    }

    /**
     * Metodo che restituisce l'area del poligono
     * @return area del poligono
     */
    public double getArea() {
        /*
        Area = (number of sides × length of one side × apothem)/2, where the value of apothem can be calculated using the
        formula, Apothem = [(length of one side)/{2 ×(tan(180/number of sides))}]
         */
//        int n_sides = vertices.length;
//        double side_length = Point2D.Double.distance(vertices[0].x, vertices[0].x, vertices[1].y, vertices[1].y);
//        double apothem = (side_length)/(2 * Math.tan(180 / n_sides));
//        double area = (n_sides * side_length * apothem) / 2;
//        return area;

        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area / 2.0);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }

    public static void main(String[] args) {
        Polygon p = new Polygon(new Point2D.Double[]{new Point2D.Double(0, 0), new Point2D.Double(2, 0),
                                                    new Point2D.Double(2, 1), new Point2D.Double(0, 1)});
        System.out.println(p.toString());
        System.out.println(p.getVerticesCount());
        System.out.println(p.getPerimeter());
        System.out.println(p.getArea());
    }
}