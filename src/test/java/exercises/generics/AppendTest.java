package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppendTest {

    @Test
    void append() {
        List<Integer> src1 = new ArrayList<>(List.of(1, 2));
        List<Integer> dst1 = new ArrayList<>(List.of());
        Append.append(dst1, src1);
        assertEquals(new ArrayList<>(List.of(1, 2)), dst1);

        List<Integer> src2 = new ArrayList<>(List.of(3, 4));
        List<Integer> dst2 = new ArrayList<>(List.of(1, 2));
        Append.append(dst2, src2);
        assertEquals(new ArrayList<>(List.of(1, 2, 3, 4)), dst2);


        List<String> src3 = new ArrayList<>(List.of("c", "d"));
        List<String> dst3 = new ArrayList<>(List.of("a", "b"));
        Append.append(dst3, src3);
        assertEquals(new ArrayList<>(List.of("a", "b", "c", "d")), dst3);
    }
}