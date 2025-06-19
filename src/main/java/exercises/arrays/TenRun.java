package exercises.arrays;

public class TenRun {
    public static int[] tenRun(int[] v) {
        int[] ris = new int[v.length];
        int decimal = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 10 == 0) {
                decimal = v[i];
            }
            if (decimal == 0) {
                ris[i] = v[i];
            }
            else {
                ris[i] = decimal;
            }
        }

        return ris;
    }
}