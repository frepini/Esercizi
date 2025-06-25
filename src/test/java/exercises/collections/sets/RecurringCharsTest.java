package exercises.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecurringCharsTest {

    @Test
    void recurringChars() {
        assertEquals(Set.of('l'), RecurringChars.recurringChars("Hello"));
        assertEquals(Set.of(), RecurringChars.recurringChars("Ciao"));
        assertEquals(Set.of('l', 'o'), RecurringChars.recurringChars("Hello World!"));
        assertEquals(Set.of('c'), RecurringChars.recurringChars("Francesco"));
        assertEquals(Set.of(), RecurringChars.recurringChars("HelLo"));
        assertEquals(Set.of(), RecurringChars.recurringChars(""));
    }
}