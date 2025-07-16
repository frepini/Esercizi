package examples.functional.streams;

import utils.Book;
import utils.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        {   // esempio 1
            List<Integer> numbers = new ArrayList<>(List.of(1, 4, 7, 2, 6, 9, 7, 8));

            long count = 0;
            for (Integer number : numbers) {
                if (number > 5) {
                    count++;
                }
            }

            // the same result could be reached using the code below
            count = numbers.stream()
                    .filter(number -> number > 5)
                    .count();
            System.out.println(count);

            List<Integer> copy = numbers.stream().
                    skip(4).
                    toList();
            System.out.println(copy);
        }
        {   // esempio 2
            List<Integer> famousNumbers = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
            Stream<Integer> numbersStream = famousNumbers.stream();

            Set<String> usefulConcepts = Set.of("functions", "lazy", "immutability");
            Stream<String> conceptsStream = usefulConcepts.stream();

            // creating stream from array
            Stream<Double> doubleStream = Arrays.stream(new Double[] {1.01, 1d, 0.99});

            // creating stream from values
            Stream<String> persons = Stream.of("John", "Demetra", "Cleopatra");
            Stream<Double> numbers = Stream.of(1.9, 2d, 17.4);

            // concatenating streams
            Stream<String> stream1 = Stream.of("John", "Demetra");
            Stream<String> stream2 = Stream.of("Cleopatra");
            Stream<String> concatenate = Stream.concat(stream1, stream2);

            /*
            TERMINAL OPERATIONS
             */
            //System.out.println(concatenate.count());
            //System.out.println(concatenate.max((s1, s2) -> s1.length() - s2.length()));
            //System.out.println(concatenate.min((s1, s2) -> s1.length() - s2.length()));
            //System.out.println(concatenate.filter((s) -> s.length() >= 5).toList());
            //System.out.println(concatenate.findFirst());
            //System.out.println(concatenate.findAny());
            //System.out.println(concatenate.anyMatch((s) -> s.length() == 4));       // true
            //System.out.println(concatenate.anyMatch((s) -> s.length() == 8));       // false
            //concatenate.forEach((s) -> System.out.println(s));
            //System.out.println(concatenate.collect(Collectors.joining()));
            // System.out.println(Arrays.toString(concatenate.toArray()));
        }
        {   // collect method

        }
    }
}
