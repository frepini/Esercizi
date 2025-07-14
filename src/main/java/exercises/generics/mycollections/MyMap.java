package exercises.generics.mycollections;

public interface MyMap<T> {
    T get(T key);

    void put(T key, T value);

    void remove(T key);

    boolean contains(T key);

    int size();
}
