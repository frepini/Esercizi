package examples.functional.functions;

import java.util.function.BiFunction;
import java.util.function.Function;
import utils.Person;

public class MethodReferences {
    public static void main(String[] args) {
        {   // PRIMO ESEMPIO
            // BiFunction<Integer, Integer, Integer> max = (a, b) -> Integer.max(a, b);
            BiFunction<Integer, Integer, Integer> max = Integer::max;

            System.out.println(max.apply(50, 70));
        }
        {   // RIFERIMENTO A METODO STATICO
            // Function<Double, Double> sqrt = (a) -> Math.sqrt(a);
            Function<Double, Double> sqrt = Math::sqrt;
            System.out.println(sqrt.apply(4.0));
            System.out.println(sqrt.apply(25.0));
        }
        {   // RIFERIMENTO A METODO DI ISTANZA DI UN OGGETTO
            String what = "What's going on here?";
            // Function<String, Integer> indexWithinWhat = (text) -> what.indexOf(text);
            Function<String, Integer> indexWithinWhat = what::indexOf;
            System.out.println(indexWithinWhat.apply("going"));
            System.out.println(indexWithinWhat.apply("Hi"));
        }
        {   // RIFERIMENTO A METODO DI ISTANZA DI UNA CLASSE PARTICOLARE
            // Function<Long, Double> converter = (l) -> l.doubleValue();
            Function<Long, Double> converter = Long::doubleValue;
            System.out.println(converter.apply(100L));
            System.out.println(converter.apply(200L));
        }
        {   // RIFERIMENTO A COSTRUTTORE
            Function<String, Person> personGenerator = Person::new;
            Person johnFoster = personGenerator.apply("John Foster");
            System.out.println(johnFoster);
            Person francescoPini = personGenerator.apply("Francesco Pini");
            System.out.println(francescoPini);
        }
    }
}
