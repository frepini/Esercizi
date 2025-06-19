package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @Test
    void splitter() {
        assertArrayEquals(new int[] {3, 2, 1}, Splitter.splitter(321));
        assertArrayEquals(new int[] {1, 2, 3}, Splitter.splitter(123));
        assertArrayEquals(new int[] {1, 3, 4, 5}, Splitter.splitter(1345));
        assertArrayEquals(new int[] {0}, Splitter.splitter(0));
        assertArrayEquals(new int[] {7, 0}, Splitter.splitter(70));
    }
}