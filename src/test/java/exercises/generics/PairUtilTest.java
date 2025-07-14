package exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairUtilTest {

    @Test
    void swap() {
        Pair<String, String> src1 = new Pair<>("Ciao", "mondo");
        assertEquals(new Pair<String, String>("mondo", "Ciao"), PairUtil.swap(src1));

        Pair<String, Integer> src2 = new Pair<>("Francesco", 21);
        assertEquals(new Pair<Integer, String>(21, "Francesco"), PairUtil.swap(src2));

        Pair<Integer, String> src3 = new Pair<>(21, "Francesco");
        assertEquals(new Pair<String, Integer>("Francesco", 21), PairUtil.swap(src3));
    }
}