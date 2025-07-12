package exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineNoDelegationTest {

    @Test
    void readLineNoDelegation() {
        assertNull(ReadLineNoDelegation.readLineNoDelegation("src/main/resources/missing-file.txt"));
        assertEquals("aahing", ReadLineNoDelegation.readLineNoDelegation("src/main/resources/english-words.txt"));
    }
}