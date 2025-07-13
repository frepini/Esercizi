package examples.generics;

import java.util.Arrays;

public class EnhancedResizableArrayGeneric<T> {
    public static final int DEFAULT_CAPACITY = 4;
    T[] v;

    public EnhancedResizableArrayGeneric() {
        this.v = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public T get(int index) {
        return v[index];
    }
    public void set(int index, T value) {
        if (index >= v.length) {
            T[] tmp = (T[])new Object[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }
    public boolean contains(T value) {
        for (T i : v) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }
    public void fill(T value) {
        Arrays.fill(v, value);
    }
    public T[] toArray() {
        return Arrays.copyOf(v, v.length);
    }
    public int length() {
        return v.length;
    }
    public static void main(String[] args) {
        EnhancedResizableArrayGeneric<String> resizableArrayGeneric = new EnhancedResizableArrayGeneric<>();
        resizableArrayGeneric.set(0, "Hello");
        // Compile-time error!
        resizableArrayGeneric.set(1, "String(2,3)");

        String s = (String)resizableArrayGeneric.get(1);
    }
}
