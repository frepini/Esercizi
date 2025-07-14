package exercises.generics.mycollections;

import java.util.Objects;

public abstract class MyAbstractCollection<T> implements MyCollection<T> {
    int size;

    protected MyAbstractCollection() {
        this.size = 0;
    }

    void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean contains(T o) {
        for (MyIterator<T> iterator = iterator(); iterator.hasNext();) {
            T element = iterator.next();
            if (Objects.equals(element, o)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (MyIterator<T> iterator = iterator(); iterator.hasNext();) {
            T element = iterator.next();
            sb.append(String.format("%s, ", element.toString()));
        }
        sb.append("]");
        return sb.toString();
    }
}
