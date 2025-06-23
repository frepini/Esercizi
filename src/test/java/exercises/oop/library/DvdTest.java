package exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DvdTest {
    Dvd d;

    @BeforeEach
    void setUp() {
        d = new Dvd("Desperation", 2006, 131);
    }

    @Test
    void getTitle() {
        assertEquals("Desperation", d.getTitle());
    }

    @Test
    void setTitle() {
        d.setTitle("DESPERATION");
        assertEquals("DESPERATION", d.getTitle());
    }

    @Test
    void getYear() {
        assertEquals(2006, d.getYear());
    }

    @Test
    void setYear() {
        d.setYear(2007);
        assertEquals(2007, d.getYear());
    }

    @Test
    void getLength() {
        assertEquals(131, d.getLength());
    }

    @Test
    void setPages() {
        d.setLength(131);
        assertEquals(131, d.getLength());
    }

    @Test
    void equalsHashCode() {
        Dvd other = new Dvd("IT", 2017, 135);
        assertNotEquals(d, other);
        assertNotEquals(d.hashCode(), other.hashCode());

        Dvd d_copy = new Dvd("Desperation", 2006, 131);
        assertEquals(d, d_copy);
        assertEquals(d.hashCode(), d_copy.hashCode());
    }
}