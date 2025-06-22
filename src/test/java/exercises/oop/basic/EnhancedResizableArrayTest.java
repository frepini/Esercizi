package exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedResizableArrayTest {
    EnhancedResizableArray array;

    @BeforeEach
    void setUp() {
        array = new EnhancedResizableArray();
        array.set(0, 0);
        array.set(1, 1);
        array.set(2, 2);
        array.set(3, 3);
    }

    @Test
    void get() {
        assertEquals(0, array.get(0));
        assertEquals(1, array.get(1));
        assertEquals(2, array.get(2));
        assertEquals(3, array.get(3));
    }

    @Test
    void set() {
        array.set(0, -1);
        assertEquals(-1, array.get(0));
        array.set(4, 4);
        assertEquals(4, array.get(4));
        assertEquals(0, array.get(7));
        assertArrayEquals(new int[] {-1, 1, 2, 3, 4, 0, 0, 0}, array.toArray());
    }

    @Test
    void contains() {
        assertTrue(array.contains(0));
        assertFalse(array.contains(5));
    }

    @Test
    void fill() {
        array.fill(21);
        assertArrayEquals(new int[] {21, 21, 21, 21}, array.toArray());
    }

    @Test
    void length() {
        assertEquals(4, array.length());
        array.set(4, 4);
        assertEquals(8, array.length());
    }

    @Test
    void toArray() {
        assertArrayEquals(new int[] {0, 1, 2, 3}, array.toArray());
        array.set(4, 4);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 0, 0, 0}, array.toArray());
        array.set(8, 10);
        assertArrayEquals(new int[] {0, 1, 2, 3, 4, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0}, array.toArray());
    }
}