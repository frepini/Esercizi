package examples.generics;

import java.awt.*;
import java.util.Arrays;

public class EnhancedResizableArrayObject {
    public static final int DEFAULT_CAPACITY = 4;
    Object[] v;

    public EnhancedResizableArrayObject() {
        this.v = new Object[DEFAULT_CAPACITY];
    }

    public Object get(int index) {
        return v[index];
    }

    public void set(int index, Object value) {
        if (index >= v.length) {
            Object[] tmp = new Object[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    public boolean contains(Object value) {
        for (Object i : v) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void fill(Object value) {
        Arrays.fill(v, value);
    }

    public Object[] toArray() {
        return Arrays.copyOf(v, v.length);
    }

    public int length() {
        return v.length;
    }

    public static void main(String[] args) {
        EnhancedResizableArrayObject resizableArrayObject1 = new EnhancedResizableArrayObject();
        resizableArrayObject1.set(0, "Hello");
        resizableArrayObject1.set(1, new Point(2,3));

        // The compiler complains here!
        String s1 = (String) resizableArrayObject1.get(0);


        EnhancedResizableArrayObject resizableArrayObject2 = new EnhancedResizableArrayObject();
        resizableArrayObject2.set(0, "Hello");
        resizableArrayObject2.set(1, new Point(2,3));

        // Run-time error! java.lang.ClassCastException
        String s2 = (String)resizableArrayObject2.get(1);
    }
}
