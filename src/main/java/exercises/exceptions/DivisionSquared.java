package exercises.exceptions;

public class DivisionSquared {
    public static int divisionSquared(int a, int b) {
        int ris;

        /*
        In order to not use an if statement, we need to use the try-catch block to
        filter the case where b == 0
        */
        try {
            ris = (a / b) * (a / b);
        } catch (ArithmeticException e) {
            ris = 0;
        }

        return ris;
    }
}
