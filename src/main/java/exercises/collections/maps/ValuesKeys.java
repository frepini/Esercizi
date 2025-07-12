package exercises.collections.maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        /*
        Per controllare se un valore è stato usato anche come chiave basta effettuare l'intersezione
        tra l'insieme delle chiavi e l'insieme dei valori
         */
        Set<String> intersection = new HashSet<>(map.keySet());
        intersection.retainAll(map.values());
        return !intersection.isEmpty();
    }
}
