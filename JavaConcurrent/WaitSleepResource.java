package JavaConcurrent;

public class WaitSleepResource {
    public synchronized void performWait() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Waiting...");
            wait(); // Releases the lock and waits for notify/notifyAll
            System.out.println(Thread.currentThread().getName() + ": Resumed after wait.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void performSleep() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Sleeping...");
            Thread.sleep(5000); // Sleeps for 2 seconds
            System.out.println(Thread.currentThread().getName() + ": Resumed after sleep.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void performNotify() {
        notify(); // Wakes up one thread waiting on this object
    }
    
}
