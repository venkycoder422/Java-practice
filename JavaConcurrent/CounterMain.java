package JavaConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CounterMain {
    public static void main(String[] args) throws InterruptedException {
        int numberOfWorkers = 3;
        CountDownLatch counterDownLatch = new CountDownLatch(numberOfWorkers);
        List<String> outputScraper = new ArrayList<>();

        for (int i = 0; i < numberOfWorkers; i++) {
            Runnable worker = new CounterDownLatchEx(outputScraper, counterDownLatch);
            new Thread(worker).start();
        }

        // This will block until countDownLatch.countDown() is called 'numberOfWorkers' times
        counterDownLatch.await();

        // Print the final output
        System.out.println("All workers have completed their tasks.");
        System.out.println("Output scraper: " + outputScraper);
    }
}
