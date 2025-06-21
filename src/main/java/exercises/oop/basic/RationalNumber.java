package exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    private final int numerator;
    private final int denominator;

    /**
     * Costruttore che crea e inizializza un nuovo oggetto RationalNumber con numeratore e denominatore specificati
     * @param numerator numeratore del numero
     * @param denominator denominatore del numero
     */
    public RationalNumber(int numerator, int denominator) {
        int mcd = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / mcd;
        this.denominator = denominator / mcd;
    }

    /**
     * Restituisce il valore dell'attributo numerator
     * @return il valore dell'attributo numerator
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * Restituisce il valore dell'attributo denominator
     * @return il valore dell'attributo denominator
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * Restituisce il RationalNumber dato dalla somma dell'oggetto su cui viene chiamato e l'oggetto passato o
     * @param o RationalNumber da sommare a quello attuale
     * @return la somma dei 2 RationalNumber
     */
    public RationalNumber add(RationalNumber o) {
        int ris_denominator = leastCommonMultiple(this.denominator, o.getDenominator());
        int ris_numerator = ris_denominator / this.denominator * this.numerator + ris_denominator / o.getDenominator() * o.getNumerator();

        return new RationalNumber(ris_numerator, ris_denominator);
    }

    /**
     * Restituisce il RationalNumber dato dal prodotto tra l'oggetto su cui viene chiamato e l'oggetto passato o
     * @param o RationalNumber da moltiplicare al primo
     * @return il prodotto dei 2 RationalNumber
     */
    public RationalNumber multiply(RationalNumber o) {
        int ris_denominator = this.denominator * o.getDenominator();
        int ris_numerator = this.numerator * o.getNumerator();

        return new RationalNumber(ris_numerator, ris_denominator);
    }

    /**
     * Restituisce il Massimo Comun Divisore (MCD) tra i numeri a e b
     * @param a primo numero intero
     * @param b secondo numero intero
     * @return MCD tra a e b
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

    /**
     * Restituisce il Minimo Comune Multiplo (MCM) tra i numeri a e b
     * @param a primo numero intero
     * @param b secondo numero intero
     * @return MCM tra a e b
     */
    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{numerator=" + numerator + ", denominator=" + denominator + "}";
    }
}