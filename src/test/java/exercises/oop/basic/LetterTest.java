package exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {
    Letter l;

    @BeforeEach
    void setUp() {
        l = new Letter("me", "you");
    }

    @Test
    void getText() {
        l.addLine("spero che tu stia bene");
        String expected = """
                Dear you:
                
                spero che tu stia bene
                
                Sincerely,
                
                me""";
        assertEquals(expected, l.getText());
    }
}