package exercises.arrays;

public class Fibonacci {
    public static long[] fibonacci(int n) {
        long[] ris = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ris[i] = 0;
            }
            else if (i == 1) {
                ris[i] = 1;
            }
            else {
                ris[i] = ris[i - 2] + ris[i - 1];
            }
        }
        return ris;
    }
}