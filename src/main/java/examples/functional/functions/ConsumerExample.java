package examples.functional.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // basic usage: printing a string
        Consumer<String> string_printer = s -> System.out.println(s);

        // intermediate usage: printing a List
        Consumer<List> list_printer = l -> System.out.println(l);

        // side-effect: adding an element to a list
        List<String> names = new ArrayList<>();
        Consumer<String> addToList = name -> names.add(name);

        // use the consumers
        string_printer.accept("Hello world!");
        addToList.accept("Alice");
        addToList.accept("Aaron");
        list_printer.accept(names);

        addToList.accept("Bob");
        addToList.accept("Claire");
        addToList.accept("David");

        names.forEach(name -> System.out.println("Hello " + name));
    }
}
