package exercises.strings;

import java.util.Arrays;

public class DuplicateChars {
    public static char[] duplicateChars(String input) {
        StringBuilder recurring = new StringBuilder();
        StringBuilder seen = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String tmp = String.valueOf(input.charAt(i));
            if (!seen.toString().contains(tmp)) {
                seen.append(input.charAt(i));
            }
            else if (!recurring.toString().contains(tmp)) {
                recurring.append(input.charAt(i));
            }
        }

        char[] ris = recurring.toString().toCharArray();
        Arrays.sort(ris);

        return ris;
    }
}