package exercises.threads;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(1);
            return 70000;
        });

        System.out.println(future.get());

        executor.shutdown();
    }
}
