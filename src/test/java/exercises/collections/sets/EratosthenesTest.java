package exercises.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {

    @Test
    void eratosthenes() {
        assertEquals(new TreeSet<>(List.of(2, 3, 5)), Eratosthenes.eratosthenes(5));
        assertEquals(new TreeSet<>(List.of(2, 3, 5, 7, 11, 13)), Eratosthenes.eratosthenes(15));
        assertEquals(new TreeSet<>(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)), Eratosthenes.eratosthenes(30));
        assertEquals(new TreeSet<>(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)), Eratosthenes.eratosthenes(50));
    }
}