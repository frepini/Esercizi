package exercises.generics.mycollections;

public interface MyDeque<T> extends MyCollection {
    void addFirst(T o);
    T removeFirst();
    void addLast(T o);
    T removeLast();
}
