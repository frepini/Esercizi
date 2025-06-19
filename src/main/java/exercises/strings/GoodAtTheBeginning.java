package exercises.strings;

/*
Write a method accepting a string and returning a boolean value. The function returns true if "good" appears at the
beginning of the string (see String.charAt() method).
 */

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s) {
        if(s.length() >= 4 && s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(goodAtTheBeginning("good Sweet"));
        System.out.println(goodAtTheBeginning(" good Sweet"));
        System.out.println(goodAtTheBeginning("goo"));
    }
}