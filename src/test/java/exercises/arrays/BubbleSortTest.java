package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void bubbleSort() {
        int v1[] = new int[] {6, 3, 4, 2};
        BubbleSort.bubbleSort(v1);
        assertArrayEquals(new int[] {2, 3, 4, 6}, v1);

        int v2[] = new int[] {9, 8, 7, 4};
        BubbleSort.bubbleSort(v2);
        assertArrayEquals(new int[] {4, 7, 8, 9}, v2);

        int v3[] = new int[] {1, 0, 0, 0};
        BubbleSort.bubbleSort(v3);
        assertArrayEquals(new int[] {0, 0, 0, 1}, v3);
    }

    @Test
    void bubbleSortCopy() {
        assertArrayEquals(new int[] {2, 3, 4, 6}, BubbleSort.bubbleSortCopy(new int[] {6, 3, 4, 2}));
        assertArrayEquals(new int[] {4, 7, 8, 9}, BubbleSort.bubbleSortCopy(new int[] {9, 8, 7, 4}));
        assertArrayEquals(new int[] {0, 0, 0, 1}, BubbleSort.bubbleSortCopy(new int[] {1, 0, 0, 0}));
    }
}