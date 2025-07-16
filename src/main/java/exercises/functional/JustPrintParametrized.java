package exercises.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {
    public static <T> void justPrintList(List<T> list, Consumer<? super T> consumer) {
        list.forEach(consumer);
        // alternative version
        //list.forEach(t -> consumer.accept(t));
    }

    public static <K, V> void justPrintMap(Map<K, V> map, BiConsumer<? super K, ? super V> consumer) {
        map.forEach(consumer);
        // alternative version
        //map.forEach((k, v) -> consumer.accept(k, v));
    }
}
