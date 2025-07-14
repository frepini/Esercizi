package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        Reverse.reverse(list1);
        assertEquals(new ArrayList<>(List.of(4, 3, 2, 1)), list1);

        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Reverse.reverse(list2);
        assertEquals(new ArrayList<>(List.of(5, 4, 3, 2, 1)), list2);

        List<String> list3 = new ArrayList<>(List.of("f", "r", "a", "n", "c", "e", "s", "c", "o"));
        Reverse.reverse(list3);
        assertEquals(new ArrayList<>(List.of("o", "c", "s", "e", "c", "n", "a", "r", "f")), list3);
    }
}