package exercises.oop.reverse;

public class ReverserFast implements Reverser {
    /**
     * Metodo che inverte il contenuto di una stringa usando la classe StringBuilder
     * @param s stringa da invertire
     * @return la stringa invertita
     */
    @Override
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}