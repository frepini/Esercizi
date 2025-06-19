package exercises.strings;

/*
Write two methods accepting a string and returning the same string without the first two characters.
The first one has to use String.charAt(), while the second one has to use StringBuilder.delete().

Examples:

removeFirstTwoChars("Hello World!") → "llo World!"
removeFirstTwoChars("No") → ""
removeFirstTwoChars("Y") → ""
 */

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string) {
        if(string.length() >= 0 && string.length() <= 2) {
            return "";
        }
        String ris = "";
        for(int i = 2; i < string.length(); i++) {
            ris += string.charAt(i);
        }
        return ris;
    }

    public static String removeFirstTwoCharsStringBuilder(String string) {
        StringBuilder sb = new StringBuilder(string);
        //sb.append(string);
        sb.delete(0, 2);        // il secondo estremo non è compreso
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeFirstTwoCharsCharAt("Hello World!"));
        System.out.println(removeFirstTwoCharsStringBuilder("Hello World!"));
        System.out.println(removeFirstTwoCharsCharAt("No"));
        System.out.println(removeFirstTwoCharsStringBuilder("No"));
        System.out.println(removeFirstTwoCharsCharAt("Y"));
        System.out.println(removeFirstTwoCharsStringBuilder("Y"));
    }
}