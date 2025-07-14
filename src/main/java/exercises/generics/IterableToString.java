package exercises.generics;

public class IterableToString {
    public static <E> String iterableToString(Iterable<E> src) {
        StringBuilder s = new StringBuilder();
        for (E e : src) {
            s.append(e.toString()).append(", ");
        }
        return s.toString();
    }
}
