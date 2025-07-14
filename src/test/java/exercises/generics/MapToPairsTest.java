package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapToPairsTest {

    @Test
    void mapToPairs() {
        List<Pair<Integer, String>> list1 = new ArrayList<>(List.of(new Pair<>(21, "f"), new Pair<>(14, "m")));
        Map<Integer, String> map1 = new HashMap<>(Map.of(21, "f", 14, "m"));
        assertEquals(list1, MapToPairs.mapToPairs(map1));

        Map<Integer, String> map2 = new HashMap<>(Map.of(1, "sistemi", 2, "operativi", 3, "elettronici"));
        List<Pair<Integer, String>> list2 = MapToPairs.mapToPairs(map2);
        for (Pair<Integer, String> pair : list2) {
            switch (pair.getFirst()) {
                case 1 -> assertEquals("sistemi", pair.getSecond());
                case 2 -> assertEquals("operativi", pair.getSecond());
                case 3 -> assertEquals("elettronici", pair.getSecond());
            }
        }
    }
}