package exercises.exceptions;

public class CheckLicencePlate {
    private static void checkAllLetters(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("The character " + c + " is not a letter");
            }
        }
    }

    private static void checkAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("The character " + c + " is not a digit");
            }
        }
    }

    public static void checkLicencePlate(String licence) {
        if (licence.length() != 7) {
            throw new IllegalArgumentException();
        }

        checkAllLetters(licence.substring(0, 2));
        checkAllDigits(licence.substring(2, 5));
        checkAllLetters(licence.substring(5, 7));
    }
}
