package exercises.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        Map<Character, Integer> first_map = new HashMap<>();
        Map<Character, Integer> second_map = new HashMap<>();
        /*
        Contiamo il numero di occorrenze per ogni carattere della prima stringa
         */
        for (Character c : first.toLowerCase().toCharArray()) {
            /*
            Il metodo getOrDefault restituisce il valore associato alla chiave passata se essa
            è presente nella mappa, mentre se non è presente passa il secondo parametro
             */
            int count = first_map.getOrDefault(c, 0);
            first_map.put(c, count + 1);
            /*
            Il modo manuale per farlo è il seguente
            if (first_map.containsKey(c)) {
                int count = first_map.get(c);
                first_map.put(c, count + 1);
            }
            else {
                first_map.put(c, 1);
            }
             */
        }

        /*
        Contiamo il numero di occorrenze per ogni carattere della seconda stringa
         */
        for (Character c : second.toLowerCase().toCharArray()) {
            /*
            Il metodo getOrDefault restituisce il valore associato alla chiave passata se essa
            è presente nella mappa, mentre se non è presente passa il secondo parametro
             */
            int count = second_map.getOrDefault(c, 0);
            second_map.put(c, count + 1);
            /*
            Il modo manuale per farlo è il seguente
            if (second_map.containsKey(c)) {
                int count = second_map.get(c);
                second_map.put(c, count + 1);
            }
            else {
                second_map.put(c, 1);
            }
             */
        }
        
        return first_map.equals(second_map);
    }
}
