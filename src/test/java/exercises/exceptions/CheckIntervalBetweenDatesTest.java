package exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesTest {

    @Test
    void checkIntervalBetweenDates() {
        assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("2021-10-10", "2021/10-10"));
        assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("2o21-10-10", "2021-10/10"));
        try {
            assertTrue(CheckIntervalBetweenDates.checkIntervalBetweenDates("2021-10-10", "2025-10-10"));
            assertFalse(CheckIntervalBetweenDates.checkIntervalBetweenDates("2025-10-10", "2021-10-10"));
        } catch (DateTimeParseException ignored) {
        }
    }
}