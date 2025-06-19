package exercises.strings;

/*
Write a method accepting a string and returning true if "good" appears either at index 0 or 1 of the given string
(see String.startsWith() method).
 */

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s) {
        if((s.length() >= 4 || s.length() >= 5) && (s.startsWith("good") || s.startsWith("good", 1))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(goodAroundTheBeginning("good Sweet"));
        System.out.println(goodAroundTheBeginning(" good Sweet"));
        System.out.println(goodAroundTheBeginning("_good Sweet"));
        System.out.println(goodAroundTheBeginning("__good Sweet"));
        System.out.println(goodAroundTheBeginning("goo"));
    }
}