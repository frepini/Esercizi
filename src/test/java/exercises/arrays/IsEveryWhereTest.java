package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsEveryWhereTest {

    @Test
    void isEveryWhere() {
        assertEquals(true, IsEveryWhere.isEveryWhere(new int[] {1, 2, 1, 3}, 1));
        assertEquals(false, IsEveryWhere.isEveryWhere(new int[] {1, 2, 1, 3}, 2));
        assertEquals(false, IsEveryWhere.isEveryWhere(new int[] {1, 2, 1, 3, 4}, 1));
    }
}