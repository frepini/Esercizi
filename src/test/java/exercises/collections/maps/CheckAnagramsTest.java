package exercises.collections.maps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAnagramsTest {

    @Test
    void areAnagrams() {
        assertTrue(CheckAnagrams.areAnagrams("dusty", "study"));
        assertTrue(CheckAnagrams.areAnagrams("francesco", "FRANCESCO"));
        assertTrue(CheckAnagrams.areAnagrams("ocsecnarf", "francesco"));
        assertFalse(CheckAnagrams.areAnagrams("francescooo", "francesco"));
        assertFalse(CheckAnagrams.areAnagrams("cheap", ""));
    }
}