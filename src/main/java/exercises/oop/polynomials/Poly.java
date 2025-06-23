package exercises.oop.polynomials;

public interface Poly {
    /**
     * Restituisce il coefficiente del termine del grado passato
     * @param degree grado del quale si vuole conoscere il coefficiente
     * @return coefficiente del termine del grado passato
     */
    double coefficient(int degree);

    /**
     * Restituisce un array contenente tutti i coefficienti del polinomio
     * @return array contenente tutti i coefficienti del polinomio
     */
    double[] coefficients();

    /**
     * Restituisce il grado del polinomio
     * @return il grado del polinomio
     */
    int degree();

    /**
     * Restituisce il polinomio derivato
     * @return il polinomio derivato
     */
    Poly derivative();
}