package exercises.strings;

/*
Write two methods accepting a string and returning the reversed string. The first one has to use only String's methods
(see String.charAt()), while the second one has to use StringBuilder's methods (see StringBuilder.reverse()).
 */

public class Reverse {
    public static String reverseCharAt(String string) {
        String ris = "";
        for(int i = 0; i < string.length(); i++) {
            ris += string.charAt(string.length() - 1 - i);
        }
        return ris;
    }
    public static String reverseStringBuilder(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseCharAt("ciao"));
        System.out.println(reverseStringBuilder("ciao"));
        System.out.println(reverseCharAt("String test"));
        System.out.println(reverseStringBuilder("String test"));
        System.out.println(reverseCharAt("John Doe"));
        System.out.println(reverseStringBuilder("John Doe"));
        System.out.println(reverseCharAt("Hello World!"));
        System.out.println(reverseStringBuilder("Hello World!"));
    }
}