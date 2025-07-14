package exercises.generics.mycollections;

public interface MyCollection<T> {
    void add(T o);

    void remove(T o);

    MyIterator<T> iterator();

    boolean contains(T o);

    int size();
}
