package exercises.collections.deque;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    List<String> sentence;

    @Test
    void reverse() {
        sentence = new LinkedList<>(List.of("Hello", "World!"));
        Reverse.reverse(sentence);
        assertEquals(List.of("World!", "Hello"), sentence);

        sentence = new LinkedList<>(List.of("I", "am"));
        Reverse.reverse(sentence);
        assertEquals(List.of("am", "I"), sentence);

        sentence = new LinkedList<>(List.of());
        Reverse.reverse(sentence);
        assertEquals(List.of(), sentence);
    }
}