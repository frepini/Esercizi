package examples.lezione2025_03_27;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* List */
        {
            /* plain, simple, long */
            List<Integer> l = new ArrayList<>();
            l.add(14);
            l.add(73);
            l.add(18);

            /* more compact version (mutable) */
            List<Integer> l1 = new ArrayList<>(Arrays.asList(14, 73, 18));
            List<Integer> l2 = new ArrayList<>(List.of(14, 73, 18));

            List<Integer> l3 = new LinkedList<>(Arrays.asList(14, 73, 18));
            List<Integer> l4 = new LinkedList<>(List.of(14, 73, 18));

            /* more compact version (immutable) */
            List<Integer> l5 = List.of(14, 73, 18);
        }

        /* Set */
        {
            List<String> l = List.of("Nicola", "Denise", "Agata", "Marzia", "Agata");

            Set<String> hs = new HashSet<>(l);
            System.out.println(hs);
            // [Denise, Marzia, Nicola, Agata]

            Set<String> lhs = new LinkedHashSet<>(l);
            System.out.println(lhs);
            // [Nicola, Denise, Agata, Marzia] mantengono l’ordine

            Set<String> ts = new TreeSet<>(l);
            System.out.println(ts);
            // [Agata, Denise, Marzia, Nicola] ordine alfabetico oppure ordine personalizzato

            /* more compact version (immutable) */
            Set<String> set = Set.of("Nicola", "Denise", "Agata", "Marzia");
        }
    }
}