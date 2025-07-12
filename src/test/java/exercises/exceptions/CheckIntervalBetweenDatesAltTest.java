package exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesAltTest {

    @Test
    void checkIntervalBetweenDatesAlt() {
        assertTrue(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2021-10-10", "2022-10-10"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2021-10-10", "2020-10-10"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2021-10-10", "2022/10/10"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("2021/10/10", "2022-10-10"));
        assertFalse(CheckIntervalBetweenDatesAlt.checkIntervalBetweenDatesAlt("202I-10-1o", "2022-10"));
    }
}