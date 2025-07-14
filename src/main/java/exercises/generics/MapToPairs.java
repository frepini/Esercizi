package exercises.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapToPairs {
    public static <K, V> List<Pair<K, V>> mapToPairs(Map<K, V> src) {
        List<Pair<K, V>> ris = new ArrayList<>();
        for (Map.Entry<K, V> e : src.entrySet()) {
            ris.add(new Pair<>(e.getKey(), e.getValue()));
        }
        return ris;
    }
}
