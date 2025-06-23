package exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    private Point upperLeft;
    private Point bottomRight;

    /**
     * Costruttore che crea e inizializza l'oggetto
     * @param id id del rettangolo
     * @param color colore del rettangolo
     * @param upperLeft punto in alto a sinistra del rettangolo
     * @param bottomRight punto in basso a destra del rettangolo
     */
    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public double getArea() {
        double base = bottomRight.getX() - upperLeft.getX();
        double altezza = upperLeft.getY() - bottomRight.getY();
        return base * altezza;
    }

    @Override
    public double getPerimeter() {
        double base = bottomRight.getX() - upperLeft.getX();
        double altezza = upperLeft.getY() - bottomRight.getY();
        return (base + altezza) * 2;
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        double newX = upperLeft.getX() + ((bottomRight.getX() - upperLeft.getX()) * scale);
        double newY = upperLeft.getY() - ((upperLeft.getY() - bottomRight.getY()) * scale);
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}