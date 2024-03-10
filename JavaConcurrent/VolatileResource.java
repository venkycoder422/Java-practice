package JavaConcurrent;

public class VolatileResource {
    private volatile boolean flag = true;

    public void stop() {
        flag = false;
    }

  
    public void printNumbers() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + ": " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Printing stopped.");
    }   
}
