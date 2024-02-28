package JavaConcurrent;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CounterDownLatchEx implements Runnable {
    private List<String> outputScraper;
    private CountDownLatch countDownLatch;

    public CounterDownLatchEx(List<String> outputScraper, CountDownLatch countDownLatch) {
        this.outputScraper = outputScraper;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        doSomeWork();
        outputScraper.add("Counted down");
        countDownLatch.countDown();
    }

    private void doSomeWork() {
        System.out.println("Do some work.");
    }
}
