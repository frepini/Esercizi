package exercises.exceptions;

import java.text.ParseException;

public class CheckString {
    public static void checkString(String s) throws ParseException {
        if (s.length() < 2 || s.length() % 2 != 0) {
            throw new ParseException(s, 0);
        }

        for (int i = 0; i < s.length(); i = i + 2) {
            char c = s.charAt(i);
            if (!Character.isLetter(c)) {
                throw new ParseException(s, i);
            }
            c = s.charAt(i + 1);
            if (!Character.isDigit(c)) {
                throw new ParseException(s, i + 1);
            }
        }
    }
}
