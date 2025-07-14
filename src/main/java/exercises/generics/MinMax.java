package exercises.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T max = list.getFirst();
        for (T item : list) {
            if (cmp.compare(item, max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T min = list.getFirst();
        for (T item : list) {
            if (cmp.compare(item, min) < 0) {
                min = item;
            }
        }
        return min;
    }
}
