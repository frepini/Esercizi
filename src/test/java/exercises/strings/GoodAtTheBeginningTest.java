package exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
    }
}