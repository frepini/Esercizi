package exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairSameTypeTest {
    @Test
    void pairTest() {
        PairSameType<String> p1 = new PairSameType<>("Francesco", "Pini");
        assertEquals("Francesco", p1.getFirst());
        p1.setSecond("Ciao");
        assertEquals("Ciao", p1.getSecond());
        p1.swap();
        assertEquals("Ciao", p1.getFirst());
        assertEquals("Francesco", p1.getSecond());

        PairSameType<Integer> p2 = new PairSameType<>(-100, 21);
        assertEquals(21, p2.getSecond());
        p2.setSecond(1);
        assertEquals(1, p2.getSecond());
        p2.swap();
        assertEquals(1, p2.getFirst());
        assertEquals(-100, p2.getSecond());
    }
}