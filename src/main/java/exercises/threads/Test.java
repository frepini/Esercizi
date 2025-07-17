package exercises.threads;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        Thread t2 = new Thread(new HelloRunnable());
        Thread t3 = new Thread(() -> {
            System.out.println("Hello, i'm " + Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
