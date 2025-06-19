package exercises.oop.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserSlowTest {
    @Test
    void reverse() {
        Reverser r = new ReverserFast();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
        assertEquals("oaic", r.reverse("ciao"));
    }
}