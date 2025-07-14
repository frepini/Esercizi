package exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    void pairTest() {
        Pair<String, String> p1 = new Pair<>("Francesco", "Pini");
        assertEquals("Francesco", p1.getFirst());
        p1.setSecond("Ciao");
        assertEquals("Ciao", p1.getSecond());

        Pair<String, Integer> p2 = new Pair<>("Francesco", 21);
        assertEquals(21, p2.getSecond());
        p2.setSecond(1);
        assertEquals(1, p2.getSecond());
    }
}