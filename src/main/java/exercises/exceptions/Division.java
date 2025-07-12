package exercises.exceptions;

public class Division {
    public static double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("The second parameter cannot be equal to 0");
        }

        return a / b;
    }
}
