package exercises.generics.mycollections;

public interface MyList<T> extends MyCollection {
    void add(T o, int index);

    T remove(int index);

    T get(int index);
}
