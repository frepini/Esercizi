package exercises.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        /*
         * Creazione di un set che conterrà il risultato
         * inizialmente aggiungiamo tutti gli elementi del primo set in quanto dobbiamo fare un unione quindi
         * gli elementi del primo set saranno di sicuro presenti nel risultato
         */
        Set<Integer> ris = new HashSet<>(first);

        /*
         * Per ogni elemento del secondo set, lo proviamo ad aggiungere al set contenente il risultato
         * nel caso in cui l'elemento sia già presente, esso non verrà aggiunto
         */
        for (Integer item : second) {
            ris.add(item);
        }

        return ris;
    }

    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second) {
        /*
         * Creazione di un set che conterrà il risultato
         * inizialmente aggiungiamo tutti gli elementi del primo set in quanto dobbiamo fare un unione quindi
         * gli elementi del primo set saranno di sicuro presenti nel risultato
         */
        Set<Integer> ris = new HashSet<>(first);

        // Utilizziamo il metodo addAll per effettuare l'unione
        ris.addAll(second);

        return ris;
    }
}