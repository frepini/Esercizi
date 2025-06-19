package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchArrayTest {

    @Test
    void containsBruteForce() {
        assertEquals(true, SearchArray.containsBruteForce(new String[] {"car", "boat", "bike", "plane"}, "bike"));
        assertEquals(false, SearchArray.containsBruteForce(new String[] {"car", "boat", "bike", "plane"}, "helicopter"));
    }

    @Test
    void containsBinary() {
        assertEquals(true, SearchArray.containsBinary(new String[] {"car", "boat", "bike", "plane"}, "bike"));
        assertEquals(false, SearchArray.containsBinary(new String[] {"car", "boat", "bike", "plane"}, "helicopter"));
    }
}