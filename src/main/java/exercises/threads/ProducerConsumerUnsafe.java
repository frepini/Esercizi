package exercises.threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ProducerConsumerUnsafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new LinkedList<>();
        Thread producer = new ProducerUnsafe(deque);
        Thread consumer = new ConsumerUnsafe(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }

    static class ProducerUnsafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProducerUnsafe(Deque<Integer> integerDeque) {
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                integerDeque.addFirst(i);
                i++;
            }
        }
    }

    static class ConsumerUnsafe extends Thread {
        final Deque<Integer> integerDeque;

        public ConsumerUnsafe(Deque<Integer> integerDeque) {
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int count = 0;
            while (!isInterrupted()) {
                try {
                    integerDeque.removeLast();
                    count++;
                } catch (NoSuchElementException e) {
                    Thread.yield();
                    //System.out.println(e);
                }
            }
            System.out.println("Total number of consumed elements: " + count);
        }
    }
}
