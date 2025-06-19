package exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] ris = new double[size];
        Arrays.fill(ris, value);
        if (addNoise) {
            RandomGenerator r = RandomGenerator.getDefault();
            for (int i = 0; i < size; i++) {
                ris[i] = ris[i] + r.nextDouble(-value, value) * 0.05;
            }
        }
        return ris;
    }
}
