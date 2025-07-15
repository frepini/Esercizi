package examples.functional.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    record Student(String name, String lastName, String email) {}

    public static Optional<Student> searchStudent(List<Student> students, String name) {
        for (Student student : students) {
            if (name.equals(student.name())) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        {   // esempio studenti
            List<Student> students = new ArrayList<>(List.of(
                    new Student("John", "Doe", "3314567543"),
                    new Student("Liz", "White", "3319876543"),
                    new Student("Sarah", "Green", "3317649432")
            ));
            Optional<Student> optionalStudent = searchStudent(students, "John");
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                System.out.println(student.email());
            }
            Optional<Student> absentStudent = searchStudent(students, "Josh");
            if (absentStudent.isPresent()) {
                Student student = absentStudent.get();
                System.out.println(student.email());
            }
        }
        {   // esempio 1 Optional (metodo empty() e metodo of())
            Optional<String> absent = Optional.empty();
            Optional<String> present = Optional.of("Ciao");
            System.out.println(absent.isPresent());
            System.out.println(present.isPresent());
        }
        {   // esempio 2 Optional (metodo ofNullable())
            Optional<String> optName = Optional.ofNullable("Ciao");
            Optional<String> optNull = Optional.ofNullable(null);
            System.out.println(optName.isPresent());
            System.out.println(optNull.isPresent());
        }
        {   // esempio 3 Optional (metodi get(), orElseThrow(), orElse())
            Optional<String> optName = Optional.ofNullable("Ciao");
            Optional<String> optNull = Optional.ofNullable(null);

            System.out.println(optName.get());                      // "Ciao"
            System.out.println(optName.orElseThrow());              // "Ciao"
            System.out.println(optName.orElse("Default"));    // "Ciao"

            //System.out.println(optNull.get());                      // throws NoSuchElementException
            //System.out.println(optNull.orElseThrow());              // throws NoSuchElementException
            System.out.println(optNull.orElse("Default"));    // "Default"
        }
        {   // esempio 4 Optional (azioni condizionate)
            Optional<String> optName = Optional.ofNullable("Ciao");
            Optional<String> optNull = Optional.ofNullable(null);

            optName.ifPresent((name) -> System.out.println(name.length()));      // prints 4
            optNull.ifPresent((name) -> System.out.println(name.length()));      // does nothing

            // prints 4
            optName.ifPresentOrElse(
                    (name) -> System.out.println(name.length()),
                    () -> System.out.println(0)
            );

            // prints 0
            optNull.ifPresentOrElse(
                    (name) -> System.out.println(name.length()),
                    () -> System.out.println(0)
            );
        }
    }
}
