package JavaConcurrent;



public class SynchronizedKeywords {
    public static void main(String[] args) {
        SharedResourceMethodClass sharedResource = new SharedResourceMethodClass();

        // Thread 1 increments the count
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
        }).start();

        // Thread 2 increments the count
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
        }).start();

        // Wait for both threads to finish
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + sharedResource.getCount());

    }
}
