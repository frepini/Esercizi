package exercises.oop.reverse;

public class ReverserSlow implements Reverser {
    /**
     * Metodo che inverte il contenuto di una stringa usando un array di char
     * @param s stringa da invertire
     * @return la stringa invertita
     */
    @Override
    public String reverse(String s) {
        char[] ris = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            ris[i] = s.charAt(s.length() - 1 - i);
        }
        return String.valueOf(ris);
    }
}