package exercises.oop.polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    /**
     * Restituisce un array che contiene i coefficienti derivati
     * @return array che contiene i coefficienti derivati
     */
    protected double[] derive() {
        double[] tmp = new double[Math.max(1, degree())];

        for (int i = 1; i <= degree(); i++) {
            tmp[i - 1] = i * coefficient(i);
        }

        return tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Poly p)) {
            return false;
        }
        if (degree() != p.degree()) {
            return false;
        }

        for (int i = 0; i <= degree(); i++) {
            if (coefficient(i) != p.coefficient(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= degree(); i++) {
            sb.append(coefficient(i)).append("x^").append(i);
            if (i != degree()) {
                sb.append(" + ");
            }
        }

        return sb.toString();
    }
}