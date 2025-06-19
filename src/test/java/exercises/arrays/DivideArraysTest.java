package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArraysTest {
    private static final double DELTA = 1e-09;

    @Test
    void divideArrays() {
        assertArrayEquals(new double[] {1 / 3.0, 1 / 3.0, 1 / 3.0}, DivideArrays.divideArrays(new double[] {1.0, 1.0, 1.0}, new double[] {3.0, 3.0, 3.0}), DELTA);
        assertArrayEquals(new double[] {0.2, 0.1, 0.1}, DivideArrays.divideArrays(new double[] {2.0, 1.0, 1.0}, new double[] {10.0, 10.0, 10.0}), DELTA);
        assertArrayEquals(new double[] {2.0, 2.0}, DivideArrays.divideArrays(new double[] {10.0, 10.0}, new double[] {5.0, 5.0}), DELTA);
        assertArrayEquals(new double[] {}, DivideArrays.divideArrays(new double[] {10.0, 10.0}, new double[] {5.0, 5.0, 5.0}), DELTA);
    }
}