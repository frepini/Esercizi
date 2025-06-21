package exercises.oop.reverse;

import exercises.oop_old.reverse.ReverserFast;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverserFastTest {

    @Test
    void reverse() {
        ReverserFast r = new ReverserFast();
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
        assertEquals("oaic", r.reverse("ciao"));
    }
}