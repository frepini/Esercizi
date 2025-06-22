package exercises.oop.reverse;

import static org.junit.jupiter.api.Assertions.*;

import exercises.oop_old.reverse.Reverser;
import org.junit.jupiter.api.Test;

public class ReverserAnonymousTest {

    @Test
    void reverse() {
        Reverser r = new Reverser() {
            @Override
            public String reverse(String s) {
                StringBuilder sb = new StringBuilder(s);
                return sb.reverse().toString();
            }
        };
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
        assertEquals("oaic", r.reverse("ciao"));
    }
}