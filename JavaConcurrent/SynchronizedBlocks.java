package JavaConcurrent;

public class SynchronizedBlocks {
    public static void main(String[] args) {
        final SharedResource sharedResource = new SharedResource();

        // Thread 1 updates the shared value
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.updateSharedValue();
            }
        }).start();

        // Thread 2 gets the shared value
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                int value = sharedResource.getSharedValue();
                System.out.println("Got value: " + value);
            }
        }).start();
    }
}
