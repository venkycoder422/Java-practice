package JavaConcurrent;

public class DiffWaitAndSleep {
    public static void main(String[] args) {
        WaitSleepResource sharedResource = new WaitSleepResource();

        // Thread 1: Calls wait
        new Thread(sharedResource::performWait, "Thread-1").start();

        // Thread 2: Calls sleep
        new Thread(sharedResource::performSleep, "Thread-2").start();

        // Main thread: Sleeps for a while and then calls notify
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sharedResource.performNotify();
    }

}
