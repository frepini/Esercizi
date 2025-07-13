package examples.generics;

import java.util.Arrays;
import java.util.List;

public class TypeInferenceWithGenerics {
    public static <T> List<T> toList(T... elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<String> fruits = toList("apple", "banana", "cherry");
        List<Integer> numbers = toList(1, 2, 3, 4, 5);

        System.out.println(fruits);
        System.out.println(numbers);
    }
}
