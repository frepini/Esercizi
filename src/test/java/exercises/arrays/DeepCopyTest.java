package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepCopyTest {

    @Test
    void deepCopy() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix1Copy = DeepCopy.deepCopy(matrix1);
        assertNotSame(matrix1Copy[0], matrix1[0]);
        assertNotSame(matrix1Copy[1], matrix1[1]);
        assertNotSame(matrix1Copy[2], matrix1[2]);

        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        int[][] matrix2Copy = DeepCopy.deepCopy(matrix2);
        assertNotSame(matrix2Copy[0], matrix2[0]);
        assertNotSame(matrix2Copy[1], matrix2[1]);
        assertNotSame(matrix2Copy[2], matrix2[2]);
        assertNotSame(matrix2Copy[3], matrix2[3]);
        assertNotSame(matrix2Copy[4], matrix2[4]);
    }
}