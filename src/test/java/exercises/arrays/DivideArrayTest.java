package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void divideArray() {
        assertArrayEquals(new double[] {0.5, 0.5, 0.5}, DivideArray.divideArray(new double[] {1.0, 1.0, 1.0}, 2.0));
        assertArrayEquals(new double[] {2.0, 1.0, 1.0}, DivideArray.divideArray(new double[] {2.0, 1.0, 1.0}, 1));
        assertArrayEquals(new double[] {1.0, 1.0, 1.0}, DivideArray.divideArray(new double[] {10.0, 10.0, 10.0}, 10.0));
    }
}