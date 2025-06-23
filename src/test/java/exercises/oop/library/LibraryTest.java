package exercises.oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library l;
    Rent r1;
    Rent r2;

    @BeforeEach
    void setUp() {
        l = new Library();
    }

    @Test
    void addRent() {
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
        assertTrue(l.addRent(r1));
        assertTrue(l.addRent(r2));
        //System.out.println(l);
    }

    @Test
    void removeRent() {
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
        l.addRent(r1);
        l.addRent(r2);
        assertTrue(l.removeRent(r1));
        assertFalse(l.removeRent(r1));
        assertTrue(l.removeRent(r2));
    }

    @Test
    void getExpired() {
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
        l.addRent(r1);
        l.addRent(r2);
        assertEquals(1, l.getExpired(LocalDate.of(2025, 6, 23)).size());
    }
}