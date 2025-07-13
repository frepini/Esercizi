package examples.generics;

import java.util.Map;

public class Main {
    static Map<String, Integer> map = Map.of(
            "nicola", 1,
            "marzia", 2,
            "agata", 3,
            "darma", 4
    );

    public static Integer getfromMap(String key) {
        return map.get(key);
    }

    public static Optional<Integer> getfromMapOptional(String key) {
        return new Optional<>(map.get(key));
    }

    public static void main(String[] args) {
        String key = "nicola";

        // risk of null pointer exception
        Integer value = map.get(key);
        if (value != null) {
            System.out.println(value);
        }

        // optional is never null
        Optional<Integer> opt = getfromMapOptional(key);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
    }
}
