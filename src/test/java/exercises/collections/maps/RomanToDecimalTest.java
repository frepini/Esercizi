package exercises.collections.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalTest {

    @Test
    void romanToDecimal() {
        assertEquals(3, RomanToDecimal.romanToDecimal("III"));
        assertEquals(58, RomanToDecimal.romanToDecimal("LVIII"));
        assertEquals(1994, RomanToDecimal.romanToDecimal("MCMXCIV"));
        assertEquals(1958, RomanToDecimal.romanToDecimal("MCMLVIII"));
        assertEquals(1964, RomanToDecimal.romanToDecimal("MCMLXIV"));
        assertEquals(1990, RomanToDecimal.romanToDecimal("MCMXC"));
        assertEquals(1993, RomanToDecimal.romanToDecimal("MCMXCIII"));
        assertEquals(2000, RomanToDecimal.romanToDecimal("MM"));
        assertEquals(2004, RomanToDecimal.romanToDecimal("MMIV"));
    }
}