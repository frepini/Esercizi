package exercises.strings;

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIfCharAt(String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (i == 0 && string.charAt(i) == 'H') {
                sb.append(string.charAt(i));
            }
            if (i == 1 && string.charAt(i) == 'e') {
                sb.append(string.charAt(i));
            }
            else if (i != 0 && i != 1){
                sb.append(string.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String string) {
        StringBuilder sb = new StringBuilder(string);

        if (string.length() >= 2 && string.charAt(1) != 'e') {
            sb.deleteCharAt(1);
        }
        if (!sb.isEmpty() && string.charAt(0) != 'H') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}