package exercises.oop_old.basic;

/*
Write a class named RationalNumber representing a rational number. RationalNumbers are immutable objects, indeed they
cannot be changed after creation. Internally, the class represents numerator and denominator as int values. RationalNumbers
must support equality with other RationalNumbers (see Object.equals(), Object.hashCode()) The class provides the following methods:

- public RationalNumber(int numerator, int denominator) creating the rational number. Before creating the object, numerator
    and denominator have to be simplified (i.e., divided by their greatest common divisor).
- public int getNumerator() returning the numerator.
- public int getDenominator() returning the denominator.
- public RationalNumber add(RationalNumber o) returning a RationalNumber object representing the sum of the current number and another number.
- public RationalNumber multiply(RationalNumber o) returning a RationalNumber object representing the multiplication of the current number and another number.
- public String toString().
You can use the following two methods for computing the least common multiple and the greatest common divisor of two integer numbers.
 */

public class RationalNumber {
    private final int numerator;
    private final int denominator;

    /**
     * Metodo che restituisce
     * @param a
     * @param b
     * @return
     */
    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator / greatestCommonDivisor(numerator, denominator);
        this.denominator = denominator / greatestCommonDivisor(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * Metodo che restituisce la somma tra 2 numeri
     * @param o numero che va sommato al numero su cui viene chiamato il metodo
     * @return numero che rappresenta la somma tra i 2 numeri
     */
    public RationalNumber add(RationalNumber o) {
        int denominator_sum = leastCommonMultiple(this.getDenominator(), o.getDenominator());
        int numerator_sum = denominator_sum / this.getDenominator() * this.getNumerator() + denominator_sum / o.getDenominator() * o.getNumerator();
        return new RationalNumber(numerator_sum, denominator_sum);
    }

    /**
     * Metodo che restituisce il prodotto tra 2 numeri
     * @param o numero che va moltiplicato al numero su cui viene chiamato il metodo
     * @return numero che rappresenta il prodotto tra i 2 numeri
     */
    public RationalNumber multiply(RationalNumber o) {
        int numerator_mult = this.getNumerator() * o.getNumerator();
        int denominator_mult = this.getDenominator() * o.getDenominator();
        return new RationalNumber(numerator_mult, denominator_mult);
    }

    /**
     * Override del metodo toString() per fare una stringa che rappresenta l'oggetto corrente in forma di frazione
     * @return la stringa che rappresenta l'oggetto in forma di frazione
     */
    @Override
    public String toString() {
        return "RationalNumber{" +
                numerator +
                "/" +
                denominator +
                '}';
    }

    public static void main(String[] args) {
        RationalNumber rn = new RationalNumber(10, 3);
        RationalNumber rn2 = new RationalNumber(14, 5);
        RationalNumber sum = rn.add(rn2);
        System.out.println(sum);
        RationalNumber prod = rn.multiply(rn2);
        System.out.println(prod);
    }
}