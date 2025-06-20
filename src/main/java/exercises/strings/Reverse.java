package exercises.strings;

public class Reverse {
    public static String reverseCharAt(String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(string.length() - i - 1));
        }

        return sb.toString();
    }

    public static String reverseStringBuilder(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb = sb.reverse();
        return sb.toString();
    }
}