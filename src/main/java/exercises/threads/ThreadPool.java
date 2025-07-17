package exercises.threads;

import java.util.random.RandomGenerator;

public class ThreadPool {
    private static final int MAX_TASKS = 8;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator rnd = RandomGenerator.getDefault();

        /*
         * Creating child threads
         */
        for (int i = 0; i < MAX_TASKS; i++) {
            int taskNumber = i;
            threadPool[i] = new Thread(() -> {
                long startTime = System.currentTimeMillis();
                System.out.println("START thread=" + Thread.currentThread().getName() + " task=" + taskNumber);
                try {
                    Thread.sleep(rnd.nextInt(1000));
                } catch (InterruptedException ignored) {

                }

                long endTime = System.currentTimeMillis();
                System.out.println("STOP thread=" + Thread.currentThread().getName() + " task=" + taskNumber + " t=" + (endTime - startTime) + " ms");
            });
        }

        /*
         * starting child threads
         */
        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].start();
        }

        /*
         * waiting child threads
         */
        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].join();
        }
    }
}
