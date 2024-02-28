package JavaConcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuterService {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            new Thread1();
        });
        executor.execute(new Thread1());
        executor.submit(() -> {
            new Thread2();
        });
        executor.execute(new Thread2());

        try {
            executor.awaitTermination(20l, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
