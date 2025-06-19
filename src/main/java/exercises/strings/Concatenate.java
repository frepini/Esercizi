package exercises.strings;

/*
Write a method accepting a String[] returning a single string representing the concatenation of all strings of the array
(see StringBuilder class).
 */

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder ris = new StringBuilder();
        for(String s : strings) {
            ris.append(s);
        }
        return ris.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate(new String[] {"Hello", " ", "World!"}));
        System.out.println(concatenate(new String[] {"H", "e", "llo", " ", "World!"}));
        System.out.println(concatenate(new String[] {"Hello World", "!"}));
    }
}