package exercises.oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly {
    private final ArrayList<Double> coefficients;

    /**
     * Costruttore che crea e inizializza un oggetto che rappresenta un polinomio tramite una lista array
     * @param coefficients coefficienti del polinomio
     */
    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double c : coefficients) {
            this.coefficients.add(c);
        }
    }

    @Override
    public double coefficient(int degree) {
        if (degree > coefficients.size()) {
            return 0.0;
        }
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] tmp = new double[coefficients.size()];

        for (int i = 0; i < coefficients.size(); i++) {
            tmp[i] = coefficients.get(i);
        }

        return tmp;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}