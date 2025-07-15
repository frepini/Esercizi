package examples.functional.functions;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Angela", "Aaron", "Bob", "Claire", "David"));
        names.replaceAll((name) -> name.toUpperCase());

        System.out.println(names);
    }
}
