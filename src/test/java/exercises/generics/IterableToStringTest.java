package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IterableToStringTest {

    @Test
    void iterableToString() {
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(new ArrayList<>(List.of(1, 2, 3))));
        assertEquals("1, 2, 3, ", IterableToString.iterableToString(new LinkedList<>(List.of(1, 2, 3))));
        assertEquals("a, b, c, ", IterableToString.iterableToString(new ArrayDeque<>(List.of("a", "b", "c"))));
        assertEquals("a, b, c, ", IterableToString.iterableToString(new TreeSet<>(List.of("b", "c", "a"))));
    }
}