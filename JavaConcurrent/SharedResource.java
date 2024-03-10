package JavaConcurrent;

public class SharedResource {
    private final Object lock = new Object();
    private int sharedValue = 0;

    public void updateSharedValue() {
        // Synchronized block ensures atomicity for the critical section
        synchronized (lock) {
            int temporaryValue = sharedValue;
            temporaryValue++;
            // Simulate some time-consuming operation
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sharedValue = temporaryValue;
            System.out.println("Updated value: " + sharedValue);
        }
    }

    public int getSharedValue() {
        return sharedValue;
    }
}
