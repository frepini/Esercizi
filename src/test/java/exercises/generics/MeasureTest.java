package exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasureTest {

    @Test
    void measure() {
        Measure.Measurer<String> measurer1 = new Measure.Measurer<>() {
            @Override
            public double measure(String obj) {
                return obj.length();
            }
        };
        assertEquals("francesco", Measure.max(new String[]{"marika", "anna", "francesco", "simone"}, measurer1));
        assertEquals("anna", Measure.min(new String[]{"marika", "anna", "francesco", "simone"}, measurer1));


        Measure.Measurer<Integer> measurer2 = new Measure.Measurer<>() {
            @Override
            public double measure(Integer obj) {
                return obj;
            }
        };
        assertEquals(2025, Measure.max(new Integer[]{100, -12, 2025, 1204}, measurer2));
        assertEquals(-12, Measure.min(new Integer[]{100, -12, 2025, 1204}, measurer2));
    }
}