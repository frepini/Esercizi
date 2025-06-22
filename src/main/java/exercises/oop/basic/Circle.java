package exercises.oop.basic;

import java.awt.*;

public class Circle {
    private Point center;
    private int radius;

    /**
     * Costruttore che crea e inizializza gli attributi di un oggetto Circlo
     * @param center centro del cerchio
     * @param radius raggio del cerchio
     */
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Restituisce il valore dell'attributo center
     * @return il valore dell'attributo center
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Assegna il valore passato all'attributo center
     * @param center valore da assegnare all'attributo center
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Restituisce il valore dell'attributo radius
     * @return il valore dell'attributo radius
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * Assegna il valore passato all'attributo radius
     * @param radius valore da assegnare all'attributo radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Restituisce il valore del perimetro del cerchio
     * @return il valore del perimetro del cerchio
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Restituisce il valore dell'area del cerchio
     * @return il valore dell'area del cerchio
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Verifica se il punto passato (point) si trova all'interno del cerchio
     * @param point il punto da verificare
     * @return true se il punto si trova all'interno, false altrimenti
     */
    public boolean contains(Point point) {
        return center.distance(point) < radius;
    }

    /**
     * Sposta il centro del cerchio di dx lungo l'asse x e di dy lungo l'asse y
     * @param dx spostamento lungo l'asse x
     * @param dy spostamento lungo l'asse y
     */
    public void translate(int dx, int dy) {
        center.setLocation(center.getX() + dx, center.getY() + dy);
    }

    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius + "}";
    }
}