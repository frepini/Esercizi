package exercises.threads;

public class StartStop extends Thread {
    public StartStop(String name) {
        super(name);
    }

    public void run() {
        long starTime = System.currentTimeMillis();
        //long startTime = System.nanoTime();
        System.out.println(getName() + " started");
        while (!interrupted()) {
            long actualTime = System.currentTimeMillis();
            //System.out.println(getName() + " running since " + TimeUnit.NANOSECONDS.toMillis(actualTime - starTime) + " ms");
            System.out.println(getName() + " running since " + (actualTime - starTime) + " ms");
        }
        System.out.println(getName() + " terminated");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new StartStop("T1");
        Thread t2 = new StartStop("T2");

        t1.start();
        t2.start();

        Thread.sleep(100L);

        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();
    }
}
