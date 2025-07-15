package examples.functional.functions;

import utils.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringStudents {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T entity : list) {
            if (predicate.test(entity)) {
                result.add(entity);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Francesco", 29.5),
                new Student("Massimo", 29.7),
                new Student("Giacomo", 27.8),
                new Student("Matteo", 25.3)
                ));
        List<Student> filtered_students = filter(students, s -> s.getAverage() <= 29);
        System.out.println(filtered_students);
    }
}
