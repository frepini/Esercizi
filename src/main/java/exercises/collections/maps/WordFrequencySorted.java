package exercises.collections.maps;

import java.util.*;

public class WordFrequencySorted {
    private static Map<String, Integer> sortMap(Map<String, Integer> map, Comparator<Map.Entry<String, Integer>> comparator, int limit) {
        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(map.entrySet());
        listMap.sort(comparator);
        listMap = new ArrayList<>(listMap.subList(0, limit));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> element : listMap) {
            result.put(element.getKey(), element.getValue());
        }

        return result;
    }

    public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
        return sortMap(map, (e1, e2) -> e2.getValue() - e1.getValue(), limit);
    }

    public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
        return sortMap(map, (e1, e2) -> e1.getValue() - e2.getValue(), limit);
    }
}
