package exercises.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor {
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        RandomGenerator rnd = RandomGenerator.getDefault();

        /*
         * creating child threads
         */
        for (int i = 0; i < MAX_TASKS; i++) {
            int taskNumber = i;
            executor.submit(() -> {
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
         * waiting child threads
         */
        executor.shutdown();
    }
}
