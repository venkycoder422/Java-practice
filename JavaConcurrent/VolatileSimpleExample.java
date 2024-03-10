package JavaConcurrent;

public class VolatileSimpleExample {
    public static void main(String[] args) {
        VolatileResource sharedResource = new VolatileResource();

        Thread thread1 = new Thread(sharedResource::printNumbers, "Thread-1");
        thread1.start();

        // Thread 2: Stops the printing after a while and prints a message
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": Sending stop signal.");
            sharedResource.stop();
        }, "Thread-2");
        thread2.start();
    }
}
