package exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        int[][] ris = new int[original.length][];

        for (int i = 0; i < original.length; i++) {
            ris[i] = Arrays.copyOf(original[i], original[i].length);
        }

        return ris;
    }
}