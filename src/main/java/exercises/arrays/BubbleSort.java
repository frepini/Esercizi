package exercises.arrays;

public class BubbleSort {
    public static void bubbleSort(int[] v) {
        boolean finito = false;
        while (!finito) {
            finito = true;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    finito = false;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v) {
        int[] copy = new int[v.length];
        System.arraycopy(v, 0, copy, 0, v.length);
        bubbleSort(copy);
        return copy;
    }
}