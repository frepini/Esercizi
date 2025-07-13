package examples.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stack<E> {
    private List<E> items = new ArrayList<>();

    public void push(E e) {
        items.addLast(e);
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public E pop() {
        return items.removeLast();
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();

        numberStack.pushAll(new ArrayList<Number>(List.of(1, 2, 3)));
        numberStack.pushAll(new ArrayList<Integer>(List.of(1, 2, 3)));


        Stack<Integer> integerStack = new Stack<>();
        integerStack.pushAll(new ArrayList<>(List.of(1, 2, 3)));

        integerStack.popAll(new ArrayList<Integer>());
        integerStack.popAll(new ArrayList<Number>());
    }
}
