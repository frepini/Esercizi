package exercises.generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private static final int MAX_ELEMENTS = 100;
    private static final RandomGenerator RND = RandomGenerator.getDefault();
    private Integer[] integers = new Integer[MAX_ELEMENTS];

    @BeforeEach
    void setUp() {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            integers[i] = i;
        }
    }

    @Test
    void findIncludedValuesSuccess() {
        for (int i = 0; i < integers.length; i++) {
            assertEquals(i, BinarySearch.find(integers, i));
        }
    }

    @Test
    void findLowerValuesFails() {
        for (int i = 0; i < integers.length; i++) {
            assertEquals(-1, BinarySearch.find(integers, RND.nextInt(-MAX_ELEMENTS, 0)));
        }
    }

    @Test
    void findHigherValuesFails() {
        for (int i = 0; i < integers.length; i++) {
            assertEquals(-1, BinarySearch.find(integers, RND.nextInt(MAX_ELEMENTS, MAX_ELEMENTS * 2)));
        }
    }
}