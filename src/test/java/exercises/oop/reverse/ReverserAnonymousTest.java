package exercises.oop.reverse;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverserAnonymousTest {

    @Test
    void reverse() {
        Reverser r = new Reverser() {      // stiamo facendo un'implementazione dell'interfaccia Reverser direttamente nel test
            @Override
            public String reverse(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        };
        assertEquals("!dlroW olleH", r.reverse("Hello World!"));
        assertEquals("oaic", r.reverse("ciao"));
    }
}