package exercises.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src) {
        Map<String, Integer> m = new HashMap<>();

        for (Map.Entry<Integer, String> element : src.entrySet()) {
            m.put(element.getValue(), element.getKey());
        }

        return m;
    }
}
