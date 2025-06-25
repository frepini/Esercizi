package exercises.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> ris = new HashSet<>();         // creazione di un nuovo set che conterrà il risultato

        for (int item : first) {                    // per ogni elemento del primo set
            if (second.contains(item)) {            // controlliamo se è presente nel secondo set
                ris.add(item);                      // in tal caso lo aggiungiamo al set del risultato
            }
        }

        return ris;
    }

    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second) {
        // creazione di un nuovo set che conterrà il risultato ma lo riempiamo con il primo set
        Set<Integer> ris = new HashSet<>(first);

        // invochiamo la funzione retainAll che effettua l'intersezione tra il set su cui viene chiamata e il set passato come parametro
        ris.retainAll(second);

        return ris;
    }
}