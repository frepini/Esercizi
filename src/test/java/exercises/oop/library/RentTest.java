package exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentTest {
    Rent r1;
    Rent r2;

    @BeforeEach
    void setUp() {
        r1 = new Rent(
                new Book("Desperation", 1996, 690),
                new Person("ID123", "Pirelli", "Leopoldo"),
                LocalDate.of(2025, 5, 5),
                LocalDate.of(2025, 6, 5));
        r2 = new Rent(
                new Book("IT", 1986, 1156),
                new Person("ID123", "Rossi", "Mario"),
                LocalDate.of(2025, 5, 27),
                LocalDate.of(2025, 6, 27));
    }

    @Test
    void getItem() {
        assertEquals(new Book("Desperation", 1996, 690), r1.getItem());
        assertEquals(new Book("IT", 1986, 1156), r2.getItem());
    }

    @Test
    void setItem() {
        r1.setItem(new Book("DESPERATION", 1997, 691));
        assertEquals(new Book("DESPERATION", 1997, 691), r1.getItem());

        r2.setItem(new Book("It", 1987, 1157));
        assertEquals(new Book("It", 1987, 1157), r2.getItem());
    }

    @Test
    void getPerson() {
        assertEquals(new Person("ID123", "Pirelli", "Leopoldo"), r1.getPerson());
        assertEquals(new Person("ID123", "Rossi", "Mario"), r2.getPerson());
    }

    @Test
    void setPerson() {
        r1.setPerson(new Person("ID123", "PIRELLI", "LEOPOLDO"));
        assertEquals(new Person("ID123", "PIRELLI", "LEOPOLDO"), r1.getPerson());

        r2.setPerson(new Person("ID123", "ROSSI", "MARIO"));
        assertEquals(new Person("ID123", "ROSSI", "MARIO"), r2.getPerson());
    }

    @Test
    void getBegin() {
        assertEquals(LocalDate.of(2025, 5, 5), r1.getBegin());
        assertEquals(LocalDate.of(2025, 5, 27), r2.getBegin());
    }

    @Test
    void setBegin() {
        r1.setBegin(LocalDate.of(2025, 10, 10));
        assertEquals(LocalDate.of(2025, 10, 10), r1.getBegin());

        r2.setBegin(LocalDate.of(2025, 10, 10));
        assertEquals(LocalDate.of(2025, 10, 10), r2.getBegin());
    }

    @Test
    void getEnd() {
        assertEquals(LocalDate.of(2025, 6, 5), r1.getEnd());
        assertEquals(LocalDate.of(2025, 6, 27), r2.getEnd());
    }

    @Test
    void setEnd() {
        r1.setEnd(LocalDate.of(2025, 10, 10));
        assertEquals(LocalDate.of(2025, 10, 10), r1.getEnd());

        r2.setEnd(LocalDate.of(2025, 10, 10));
        assertEquals(LocalDate.of(2025, 10, 10), r2.getEnd());
    }

    @Test
    void isExpired() {
        assertTrue(r1.isExpired(LocalDate.of(2025, 6, 23)));
        assertFalse(r2.isExpired(LocalDate.of(2025, 6, 23)));
    }

    @Test
    void equalsHashCode() {
        Rent r1_copy = new Rent(
                new Book("Desperation", 1996, 690),
                new Person("ID123", "Pirelli", "Leopoldo"),
                LocalDate.of(2025, 5, 5),
                LocalDate.of(2025, 6, 5));

        assertEquals(r1, r1_copy);
        assertNotEquals(r1, r2);
        assertEquals(r1.hashCode(), r1_copy.hashCode());
        assertNotEquals(r1.hashCode(), r2.hashCode());
    }
}