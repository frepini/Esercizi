package exercises.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> ris = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            ris.add(i);
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            Set<Integer> multiples = new HashSet<>();
            for (int j = 2; i * j <= n; j++) {
                multiples.add(i * j);
            }
            ris.removeAll(multiples);
        }

        return ris;
    }
}