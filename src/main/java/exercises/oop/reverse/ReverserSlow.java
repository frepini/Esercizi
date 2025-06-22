package exercises.oop.reverse;

public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String s) {
        char[] ris = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ris[s.length() - i - 1] = s.charAt(i);
        }

        return String.valueOf(ris);
    }
}