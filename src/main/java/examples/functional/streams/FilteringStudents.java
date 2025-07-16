package examples.functional.streams;

import utils.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringStudents {
    record Student (String name, String secondName, double average) {}

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("John", "Doe", 24),
                new Student("Dimebag", "Darrell", 25),
                new Student("Eric", "Baret", 28),
                new Student("Tyler", "Durden", 20),
                new Student("Jack", "Napier", 22),
                new Student("Diana", "Krall", 27),
                new Student("Rosa", "Luxemburg", 30)));

        /*
        We need to select a group of students with a specific features, accumulate them into a List,
        and also print a string representation of those selected.
         */
        List<Student> selectedStudents = students.stream()
                .filter(s -> s.average() >= 26 && s.average() <= 30)
                .peek(s -> System.out.println(s.name() + " " + s.secondName() + " " + s.average()))
                .collect(Collectors.toList());
    }
}
