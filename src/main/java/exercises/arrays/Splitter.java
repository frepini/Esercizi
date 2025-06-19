package exercises.arrays;

public class Splitter {
    public static int[] splitter(int input) {
        int number_length = Integer.toString(input).length();
        int ris[] = new int[number_length];

        for (int i = number_length - 1; i >= 0; i--) {
            ris[i] = input % 10;
            input /= 10;
        }

        return ris;
    }
}