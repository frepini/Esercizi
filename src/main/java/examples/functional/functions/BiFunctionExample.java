package examples.functional.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // add two integers
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;

        // concatenate two strings
        BiFunction<String, String, String> joiner = (s1, s2) -> s1 + s2;

        // sum the length of two strings
        BiFunction<String, String, Integer> sumLength = (s1, s2) -> s1.length() + s2.length();

        // use the bifunctions
        System.out.println(adder.apply(3, 4));
        System.out.println(joiner.apply("Hello ", "World!"));
        System.out.println(sumLength.apply("Hello", "world"));

        Map<String, Integer> salaries = new HashMap<>(Map.of(
                "John", 40000,
                "Freddy", 30000,
                "Samuel", 50000
        ));

        salaries.replaceAll((name, salary) -> name.startsWith("F") ? salary * 2 : salary + 2);

        // prints {John=40002, Samuel=50002, Freddy=60000}
        System.out.println(salaries);
    }
}
