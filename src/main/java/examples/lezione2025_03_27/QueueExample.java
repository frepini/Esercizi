package examples.lezione2025_03_27;

import java.util.*;

public class QueueExample {
    public static final List<Integer> VALUES = List.of(5, 1, 2, 4, 3);

    public static void fillQueue(Queue<Integer> queue) {
        for (Integer integer : VALUES) {
            queue.add(integer);
        }
    }

    public static void emptyQueue(Queue<Integer> queue) {
        System.out.println(queue.getClass().getName());
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> fifo = new LinkedList<>();
        Queue<Integer> fifoArray = new ArrayDeque<>();
        Queue<Integer> pqueue = new PriorityQueue<>();

        fillQueue(fifo);
        fillQueue(fifoArray);
        fillQueue(pqueue);

        emptyQueue(fifo);      // 5, 1, 2, 4, 3
        emptyQueue(fifoArray); // 5, 1, 2, 4, 3
        emptyQueue(pqueue);    // 1, 2, 3, 4, 5
    }
}