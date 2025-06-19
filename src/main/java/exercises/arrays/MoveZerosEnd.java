package exercises.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] ris = new int[v.length];
        int i = 0;

        for (int k : v) {
            if (k != 0) {
                ris[i] = k;
                i++;
            }
        }

        return ris;
    }
}