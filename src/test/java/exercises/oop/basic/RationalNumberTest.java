package exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {

    @Test
    void getNumerator() {
        RationalNumber rn = new RationalNumber(9, 3);
        assertEquals(3, rn.getNumerator());
    }

    @Test
    void getDenominator() {
        RationalNumber rn = new RationalNumber(6, 3);
        assertEquals(1, rn.getDenominator());
    }

    @Test
    void add() {
        RationalNumber rn1 = new RationalNumber(2, 3);
        RationalNumber rn2 = new RationalNumber(2, 3);
        assertEquals(new RationalNumber(4, 3), rn1.add(rn2));
        RationalNumber rn3 = new RationalNumber(5, 10);
        RationalNumber rn4 = new RationalNumber(5, 10);
        assertEquals(new RationalNumber(1, 1), rn3.add(rn4));
    }

    @Test
    void multiply() {
        RationalNumber rn1 = new RationalNumber(6, 3);
        RationalNumber rn2 = new RationalNumber(6, 3);
        assertEquals(new RationalNumber(4, 1), rn1.multiply(rn2));
        RationalNumber rn3 = new RationalNumber(4, 3);
        RationalNumber rn4 = new RationalNumber(-3, 2);
        assertEquals(new RationalNumber(-2, 1), rn3.multiply(rn4));
    }

    @Test
    void testEquals() {
        RationalNumber rn1 = new RationalNumber(6, 3);
        RationalNumber rn2 = new RationalNumber(6, 3);
        RationalNumber rn3 = new RationalNumber(10, 9);
        assertEquals(rn1, rn2);
        assertNotEquals(rn1, rn3);
        assertNotEquals(rn1, null);
    }

    @Test
    void testHashCode() {
        RationalNumber rn1 = new RationalNumber(6, 3);
        RationalNumber rn2 = new RationalNumber(6, 3);
        assertEquals(rn1.hashCode(), rn2.hashCode());
    }

    @Test
    void testToString() {
        RationalNumber rn1 = new RationalNumber(4, 3);
        assertEquals("RationalNumber{numerator=4, denominator=3}", rn1.toString());
    }
}