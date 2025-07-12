package exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadLinePartialDelegationTest {

    @Test
    void readLinePartialDelegation() {
        assertThrows(RuntimeException.class, () -> ReadLinePartialDelegation.readLinePartialDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing", ReadLinePartialDelegation.readLinePartialDelegation("src/main/resources/english-words.txt"));
    }
}