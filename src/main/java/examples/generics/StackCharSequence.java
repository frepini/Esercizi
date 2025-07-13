package examples.generics;

import java.util.ArrayList;
import java.util.List;

public class StackCharSequence<E extends CharSequence> {
    private List<E> items = new ArrayList<>();

    public void push(E e) {
        items.addLast(e);
    }

    public void pushAll(Iterable<E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public E pop() {
        return items.removeLast();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static void main(String[] args) {
        StackCharSequence<String> strings = new StackCharSequence<>();          // ok
        StackCharSequence<StringBuilder> builders = new StackCharSequence<>();  // ok
        //Stack<Point> points = new Stack<>();            // compile-time error!
    }
}
