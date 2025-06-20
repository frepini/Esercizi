package exercises.strings;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        StringBuilder reversed = new StringBuilder(s);

        reversed = reversed.reverse();
        if (s.equalsIgnoreCase(reversed.toString())) {
            return true;
        }

        return false;
    }
}