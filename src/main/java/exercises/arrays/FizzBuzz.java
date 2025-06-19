package exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        if (start >= end || start < 0 || end < 0) {
            return new String[] {};
        }

        String[] ris = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ris[i - start] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                ris[i - start] = "Fizz";
            }
            else if (i % 5 == 0) {
                ris[i - start] = "Buzz";
            }
            else {
                ris[i - start] = Integer.toString(i);
            }
        }

        return ris;
    }
}