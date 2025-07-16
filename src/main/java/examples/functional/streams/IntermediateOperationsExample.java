package examples.functional.streams;

import utils.Book;
import utils.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        {   // filter method
            List<Integer> primeNumbers = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
            // we want only prime numbers that belong to the range from 11 and 23 (included)
            List<Integer> filteredPrimeNumbers = primeNumbers.stream()
                    .filter(number -> number >= 11 && number <= 23)
                    .collect(Collectors.toList());


            List<String> programmingLanguages = Arrays.asList("Java", "", "scala", "Kotlin", "", "clojure");
            // we want to count programming languages that start with an upper letter ignoring all the empty strings
            long count = programmingLanguages.stream()
                    .filter(s -> s.length() > 0)
                    .filter(s -> Character.isUpperCase(s.charAt(0)))
                    .count();
            // other way using just una filter, but it is less readable
            /*
            long count = programmingLanguages.stream()
                    .filter((s) -> (s.length() > 0) && (Character.isUpperCase(s.charAt(0))))
                    .count();
             */
            System.out.println(count);
        }
        {   // map method
            List<Double> numbers = List.of(6.28, 5.42, 84.0, 26.0);

            List<Double> dividedNumbers = numbers.stream()
                    .map(n -> n / 2)
                    .collect(Collectors.toList());
            System.out.println(dividedNumbers);


            List<Job> jobs = new ArrayList<>(List.of(
                    new Job("ingegnere", "è un ingegnere", 2000),
                    new Job("insegnante", "è un insegnante", 1700)));
            List<String> jobTitles = jobs.stream()
                    .map(Job::getTitle)
                    .collect(Collectors.toList());
            System.out.println(jobTitles);
        }
        {   // flatMap method
            List<Book> javaBooks = List.of(
                    new Book("Java EE 7 Essentials", 2013, List.of("Arun Gupta")),
                    new Book("Algorithms", 2011, List.of("Robert Sedgewick", "Kevin Wayne")),
                    new Book("Clean code", 2014, List.of("Robert Martin"))
            );
            // let's get a list of all the authors of all books
            List<String> authors = javaBooks.stream()
                    .flatMap(book -> book.getAuthors().stream())
                    .collect(Collectors.toList());
            System.out.println(authors);
        }
        {   // peek method
            List<Integer> primeNumbers = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
            List<Integer> primeNumbersCopy = primeNumbers.stream()
                    // synthetic form for .peek(number -> System.out.println(number))
                    .peek(System.out::println)
                    .collect(Collectors.toList());
        }
    }
}
