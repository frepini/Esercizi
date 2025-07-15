package examples.functional.functions;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // if it has only one argument "()" are optional
        Function<Integer, Integer> adder1 = x -> x + 1;

        // multiple statements
        Function<Integer, Integer> adder5 = x -> {
            x += 3;
            x += 2;
            return x;
        };

        // with different types
        Function<String, Integer> length = s -> s.length();

        // use the predicate
        System.out.println(adder1.apply(5));
        System.out.println(adder5.apply(5));
        System.out.println(length.apply("francesco"));
    }
}
