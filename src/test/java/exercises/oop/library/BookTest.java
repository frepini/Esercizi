package exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book b;

    @BeforeEach
    void setUp() {
        b = new Book("Desperation", 1996, 690);
    }

    @Test
    void getTitle() {
        assertEquals("Desperation", b.getTitle());
    }

    @Test
    void setTitle() {
        b.setTitle("DESPERATION");
        assertEquals("DESPERATION", b.getTitle());
    }

    @Test
    void getYear() {
        assertEquals(1996, b.getYear());
    }

    @Test
    void setYear() {
        b.setYear(1997);
        assertEquals(1997, b.getYear());
    }

    @Test
    void getPages() {
        assertEquals(690, b.getPages());
    }

    @Test
    void setPages() {
        b.setPages(624);
        assertEquals(624, b.getPages());
    }

    @Test
    void equalsHashCode() {
        Book other = new Book("IT", 1986, 1156);
        assertNotEquals(b, other);
        assertNotEquals(b.hashCode(), other.hashCode());

        Book b_copy = new Book("Desperation", 1996, 690);
        assertEquals(b, b_copy);
        assertEquals(b.hashCode(), b_copy.hashCode());
    }
}