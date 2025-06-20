package exercises.strings;

public class EqualIsNot {
    public static boolean equalIsNot(String string) {
        if (string.isEmpty() || string == null) {
            return true;
        }

        int indexIs = string.indexOf("is");
        int indexNot = string.indexOf("not");
        while (indexIs != -1 && indexNot != -1) {
            indexIs = string.indexOf("is", indexIs + 2);
            indexNot = string.indexOf("not", indexNot + 3);
        }

        return indexIs == indexNot;
    }
}