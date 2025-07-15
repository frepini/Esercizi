package examples.functional.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // basic usage: check if number is positive
        Predicate<Integer> isPositive = x -> x > 0;

        // basic usage: check if string is empty
        Predicate<String> isEmpty = s -> s.isEmpty();

        // use the predicates
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-1));
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("c"));

        List<String> names = new ArrayList<>(List.of("Angela", "Aaron", "Bob", "Claire", "David"));
        names.removeIf(s -> s.startsWith("B"));
        System.out.println(names);
    }
}
