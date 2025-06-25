package exercises.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string) {
        /*
         * Per questo metodo usiamo 2 set: il primo (chiamato seen) contiene i caratteri presenti almeno 1 volta
         * all'interno della stringa, il secondo (chiamato duplicates) contiene i caratteri presenti almeno 2 volte
         * all'interno della stringa
         */
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        /*
         * Per ogni carattere della stringa, controlliamo se è già presente nel set dei caratteri visti perché,
         * in quel caso, lo aggiungiamo al set dei duplicati, altrimenti lo aggiungiamo al set dei visti
         */
        for (char c : string.toCharArray()) {
            if (seen.contains(c)) {
                duplicates.add(c);
            }
            else {
                seen.add(c);
            }
        }

        return duplicates;
    }
}