package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendBoundedTest {

    @Test
    void append() {
        List<Number> numbers = new ArrayList<>(List.of(1, 2));
        List<Integer> integers = new ArrayList<>(List.of(3, 4));
        AppendBounded.append(numbers, integers);
        assertEquals(new ArrayList<>(List.of(1, 2, 3, 4)), numbers);

        // since Integer is a subclass of Number, the call below doesn't work
        // AppendBounded.append(integers, numbers);
    }
}