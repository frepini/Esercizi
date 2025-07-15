package examples.functional.functions;

import java.util.HashMap;
import java.util.Map;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>(Map.of(
                "John", 40000,
                "Freddy", 30000,
                "Samuel", 50000
        ));

        salaries.forEach((name, salary) -> System.out.println(name + " earns " + salary + " dollars/year!"));

        // prints:
        // John earns 40000 dollars/year!
        // Freddy earns 30000 dollars/year!
        // Samuel earns 50000 dollars/year!
    }
}
