package exercises.strings;

/*
Write a method accepting a string and returning the same string trimmed of the first and last characters if the first
and last characters are equal. Otherwise, the original string is returned (see String.substring(), String.charAt() methods).
 */

public class RemoveFirstLast {
    public static String removeFirstLast(String s) {
        String ris = s;
        if(s.length() > 1 && s.charAt(0) == s.charAt(s.length() - 1)) {
            ris = ris.substring(1, s.length() - 1);
            // substring(first character to keep in the string, first character to remove from the string)
        }
        return ris;
    }

    public static void main(String[] args) {
        System.out.println(removeFirstLast("google"));
        System.out.println(removeFirstLast("aenema"));
        System.out.println(removeFirstLast("FF"));
        System.out.println(removeFirstLast("F"));
    }
}