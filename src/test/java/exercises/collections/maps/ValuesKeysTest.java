package exercises.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ValuesKeysTest {

    @Test
    void valuesKeys() {
        assertFalse(ValuesKeys.valuesKeys(Map.of("1", "ciao", "2", "secondo", "3", "tre")));
        assertTrue(ValuesKeys.valuesKeys(Map.of("1", "1", "2", "second")));
        assertTrue(ValuesKeys.valuesKeys(Map.of("1", "primo", "2", "1")));
        assertFalse(ValuesKeys.valuesKeys(Map.of()));
    }
}