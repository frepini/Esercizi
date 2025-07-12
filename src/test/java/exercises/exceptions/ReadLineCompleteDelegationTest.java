package exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineCompleteDelegationTest {

    @Test
    void readLineCompleteDelegation() throws IOException {
        assertThrows(IOException.class, () -> ReadLineCompleteDelegation.readLineCompleteDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing", ReadLineCompleteDelegation.readLineCompleteDelegation("src/main/resources/english-words.txt"));
    }
}