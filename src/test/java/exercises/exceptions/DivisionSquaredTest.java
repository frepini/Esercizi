package exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionSquaredTest {

    @Test
    void divisionSquared() {
        assertEquals(0, DivisionSquared.divisionSquared(1, 0));
        assertEquals(0, DivisionSquared.divisionSquared(-2, 0));
        assertEquals(0, DivisionSquared.divisionSquared(1, 2), 0.001);
        assertEquals(1, DivisionSquared.divisionSquared(-3, 2), 0.001);
    }
}