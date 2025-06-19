package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanBalanceTest {

    @Test
    void canBalance() {
        assertEquals(true, CanBalance.canBalance(new int[] {1, 1, 1, 2, 1}));
        assertEquals(false, CanBalance.canBalance(new int[] {2, 1, 1, 2, 1}));
        assertEquals(true, CanBalance.canBalance(new int[] {10, 10}));
    }
}