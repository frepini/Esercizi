package exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void division() {
        assertThrows(IllegalArgumentException.class, () -> Division.division(5, 0));
        assertThrows(IllegalArgumentException.class, () -> Division.division(0, 0));
        assertEquals(0.5 , Division.division(1, 2), 0.001);
        assertEquals(-1.5 , Division.division(-3, 2), 0.001);
        assertEquals(-2.5 , Division.division(5, -2), 0.001);
    }
}