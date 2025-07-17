package exercises.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {
    static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);     // we consider a total of 4 threads

        List<Callable<List<Integer>>> callables = new ArrayList<>();

        /*
         * adding the callables to the list of callables
         * NB: since we put that i < 6, we will find the prime numbers between 0 and 6000
         */
        for (int i = 0; i < 6; i++) {
            callables.add(new PrimeEngine(i * 1000, (i + 1) * 1000));
        }

        /*
         * we save the results of all the threads in the futures variabile
         */
        List<Future<List<Integer>>> futures = executor.invokeAll(callables);

        /*
         * we emulate that the main thread does other things
         */
        Thread.sleep(1000);

        /*
         * we print the results of all the threads on standard output
         */
        for (Future<List<Integer>> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
