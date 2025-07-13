package examples.generics;

public class Optional<T> {
    private final T value;

    /**
     * Takes a value of “some type” and assigns it to the field
     */
    public Optional(T t) {
        this.value = t;
    }

    /**
     * Returns a value of “some type”
     */
    public T get() {
        return value;
    }

    /**
     * Returns true if value is not null
     */
    public boolean isPresent() {
        return value != null;
    }

    public static void main(String[] args) {
        Optional<Integer> o1 = new Optional<>(5);
        Optional<String> o2 = new Optional<>("Hello!");

        Integer i = o1.get();		// i = 5
        String s = o2.get();		// s = “Hello!”
    }
}
