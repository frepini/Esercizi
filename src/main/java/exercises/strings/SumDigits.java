package exercises.strings;

public class SumDigits {
    public static int sumDigits(String string) {
        int sum = 0;

        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        /* versione alternativa (mia soluzione iniziale)
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                sum += Character.getNumericValue(string.charAt(i));
            }
        }
        */

        return sum;
    }
}