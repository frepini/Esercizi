package exercises.threads.lockingGranularity;

public class LockingGranularity {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        Actor a = new Actor(resource::A);
        Actor b = new Actor(resource::B);
        Actor c = new Actor(resource::C);

        a.start();
        b.start();
        c.start();

        Thread.sleep(10L);

        a.interrupt();
        b.interrupt();
        c.interrupt();

        a.join();
        b.join();
        c.join();
    }
}
