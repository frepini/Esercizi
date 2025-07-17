package exercises.threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ProducerConsumerSafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> deque = new LinkedList<>();
        Thread producer = new ProducerSafe(deque);
        Thread consumer = new ConsumerSafe(deque);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();
    }

    static class ProducerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProducerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!isInterrupted()) {
                synchronized (integerDeque) {
                    integerDeque.addFirst(i);
                    i++;
                }
            }
        }
    }

    static class ConsumerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ConsumerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        public void run() {
            int count = 0;
            while (!isInterrupted()) {
                try {
                    synchronized (integerDeque) {
                        integerDeque.removeLast();
                        count++;
                    }
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }

            System.out.println("Total number of consumed elements: " + count);
        }
    }
}
