package exercises.oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    /**
     * Costruttore che crea e inizializza un oggetto che rappresenta un polinomio tramite un array
     * @param coefficients coefficienti del polinomio
     */
    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double coefficient(int degree) {
        if (degree >= coefficients.length) {
            return 0.0;
        }
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] coefficients_derivative = derive();

        return new ArrayPoly(coefficients_derivative);
    }
}