package exercises.collections.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class DownSizeTest {
    List<String> list;

    @Test
    void downsize() {
        list = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        DownSize.downsize(list, 2);
        assertEquals(List.of("A", "C", "E"), list);

        list = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        DownSize.downsize(list, 3);
        assertEquals(List.of("A", "B", "D", "E"), list);

        list = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
        DownSize.downsize(list, 1);
        assertEquals(List.of(), list);
    }
}