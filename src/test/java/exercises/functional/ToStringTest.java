package exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import utils.Student;

class ToStringTest {

    @Test
    void testToString() {
        assertEquals("1,2,3,4,5", ToString.toString(Stream.of(1, 2, 3, 4, 5), 5));
        assertEquals("1,2,3,4,5", ToString.toString(Stream.of(1, 2, 3, 4, 5), 10));
        assertEquals("1,2", ToString.toString(Stream.of(1, 2, 3, 4, 5), 2));
        assertEquals("Student{name='Francesco', average=29.571}", ToString.toString(Stream.of(new Student("Francesco", 29.571)), 5));
        assertEquals("Student{name='Francesco', average=29.571},Student{name='Massimo', average=29.734}", ToString.toString(Stream.of(
                new Student("Francesco", 29.571),
                new Student("Massimo", 29.734)), 5));
    }
}