package exercises.collections.sets;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordAfterWordTest {
    final String filename = "src/main/resources/james-joyce-ulysses.txt";

    @Test
    void wordAfterWord() throws IOException {
        assertEquals("yesterdays", WordAfterWord.wordAfterWord(filename, "yesterday"));
        assertEquals("gold", WordAfterWord.wordAfterWord(filename, "goings"));
        assertEquals("zero", WordAfterWord.wordAfterWord(filename, "zermatt"));
    }
}