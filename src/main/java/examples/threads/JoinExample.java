package examples.threads;

public class JoinExample {
    public static void main(String[] args) throws Exception {
        Thread worker = new Worker();
        worker.start();               // start the worker
        System.out.println("Do something useful");
        worker.join(3000L);     // waiting for the worker
        System.out.println("The program stopped");
    }
}
