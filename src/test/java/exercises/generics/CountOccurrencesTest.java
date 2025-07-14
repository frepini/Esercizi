package exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTest {

    @Test
    void countOccurencesPlain() {
        assertEquals(1, CountOccurrences.countOccurencesPlain(new Integer[]{1, 2, 3}, 3));
        assertEquals(3, CountOccurrences.countOccurencesPlain(new Integer[]{1, 2, 3, 3, 3}, 3));
        assertEquals(2, CountOccurrences.countOccurencesPlain(new Integer[]{null, 2, null}, null));
        assertEquals(1, CountOccurrences.countOccurencesPlain(new Integer[]{null, 2, null}, 2));
    }

    @Test
    void countOccurencesObjects() {
        assertEquals(1, CountOccurrences.countOccurencesObjects(new Integer[]{1, 2, 3}, 3));
        assertEquals(3, CountOccurrences.countOccurencesObjects(new Integer[]{1, 2, 3, 3, 3}, 3));
        assertEquals(2, CountOccurrences.countOccurencesObjects(new Integer[]{null, 2, null}, null));
        assertEquals(1, CountOccurrences.countOccurencesObjects(new Integer[]{null, 2, null}, 2));
    }
}