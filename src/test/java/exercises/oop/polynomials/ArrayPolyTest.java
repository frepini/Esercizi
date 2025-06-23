package exercises.oop.polynomials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPolyTest {
    ArrayPoly p1;
    ArrayPoly p2;
    ArrayPoly p1_copy;

    @BeforeEach
    void setUp() {
        p1 = new ArrayPoly(new double[] {1, 2, 3, 4});
        p2 = new ArrayPoly(new double[] {10, 4, 2, 7, 1});
        p1_copy = new ArrayPoly(new double[] {1, 2, 3, 4});
    }

    @Test
    void coefficient() {
        assertEquals(1, p1.coefficient(0));
        assertEquals(2, p1.coefficient(1));
        assertEquals(3, p1.coefficient(2));
        assertEquals(4, p1.coefficient(3));

        assertEquals(10, p2.coefficient(0));
        assertEquals(4, p2.coefficient(1));
        assertEquals(2, p2.coefficient(2));
        assertEquals(7, p2.coefficient(3));
        assertEquals(1, p2.coefficient(4));
    }

    @Test
    void coefficients() {
        assertArrayEquals(new double[] {1, 2, 3, 4}, p1.coefficients());

        assertArrayEquals(new double[] {10, 4, 2, 7, 1}, p2.coefficients());
    }

    @Test
    void degree() {
        assertEquals(3, p1.degree());

        assertEquals(4, p2.degree());
    }

    @Test
    void derivative() {
        assertEquals(new ArrayPoly(new double[] {2, 6, 12}), p1.derivative());

        assertEquals(new ArrayPoly(new double[] {4, 4, 21, 4}), p2.derivative());
    }

    @Test
    void equals() {
        assertNotEquals(p1, p2);
        assertEquals(p1, p1);
        assertNotEquals(null, p1);
        assertEquals(p1, p1_copy);
    }
}