package exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(1, 6));
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, FizzBuzz.fizzBuzz(1, 8));
        assertArrayEquals(new String[] {"Fizz", "13", "14", "FizzBuzz", "16"}, FizzBuzz.fizzBuzz(12, 17));
        assertArrayEquals(new String[] {}, FizzBuzz.fizzBuzz(8, 1));
        assertArrayEquals(new String[] {}, FizzBuzz.fizzBuzz(0, 0));
        assertArrayEquals(new String[] {}, FizzBuzz.fizzBuzz(-1, -1));
        assertArrayEquals(new String[] {}, FizzBuzz.fizzBuzz(-2, -5));
    }
}