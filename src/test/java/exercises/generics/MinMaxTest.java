package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    @Test
    void maxMin() {
        Comparator<Integer> integer_cmp = new Comparator<>() {
            /**
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return a positive number if o1 > o2, 0 if o1 == o2, a negative number if o1 < o2
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        List<Integer> integer_list = new ArrayList<>(List.of(90, -123, 23, 189, 21));
        assertEquals(189, MinMax.max(integer_list, integer_cmp));
        assertEquals(-123, MinMax.min(integer_list, integer_cmp));
        // alternative version to create the Comparator
        assertEquals(189, MinMax.max(integer_list, (o1, o2) -> o1.compareTo(o2)));
        assertEquals(-123, MinMax.min(integer_list, (o1, o2) -> o1.compareTo(o2)));

        Comparator<String> string_cmp = new Comparator<>() {
            /**
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return a positive number if the o1 is longer than o2, 0 if o1 have the same length of o2, a negative number if o1 is shorter than o2
             */
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        List<String> string_list = new ArrayList<>(List.of("francesco", "marika", "anna", "giancarlo"));
        assertEquals("francesco", MinMax.max(string_list, string_cmp));
        assertEquals("anna", MinMax.min(string_list, string_cmp));
    }
}