package JavaConcurrent;
public class ThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.setDaemon(true);
        t1.start();
        t1.join();
        t2.start();
    
        
    }
}
