package exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    public static final double DELTA = 1e-06;
    Circle c;

    @BeforeEach
    void setUp() {
        c = new Circle(new Point(5, 5), 10);
    }

    @Test
    void getCenter() {
        assertEquals(new Point(5, 5), c.getCenter());
    }

    @Test
    void setCenter() {
        c.setCenter(new Point(6, 6));
        assertEquals(new Point(6, 6), c.getCenter());
    }

    @Test
    void getRadius() {
        assertEquals(10, c.getRadius());
    }

    @Test
    void setRadius() {
        c.setRadius(15);
        assertEquals(15, c.getRadius());
    }

    @Test
    void getPerimeter() {
        assertEquals(62.8318530718, c.getPerimeter(), DELTA);
    }

    @Test
    void getArea() {
        assertEquals(314.159265359, c.getArea(), DELTA);
    }

    @Test
    void contains() {
        assertTrue(c.contains(new Point(0, 0)));
        assertTrue(c.contains(new Point(10, 10)));
        assertTrue(c.contains(new Point(0, 10)));
        assertTrue(c.contains(new Point(10, 0)));
        assertFalse(c.contains(new Point(15, 15)));
        assertFalse(c.contains(new Point(-15, -15)));
        assertFalse(c.contains(new Point(-5, 5)));
    }

    @Test
    void translate() {
        c.translate(-5, -5);
        assertEquals(new Point(0, 0), c.getCenter());
    }

    @Test
    void testToString() {
        assertEquals("Circle{center=java.awt.Point[x=5,y=5], radius=10}", c.toString());
    }
}