package JavaConcurrent;

import java.util.concurrent.TimeUnit;

public class Thread1 implements Runnable{

    @Override
    public void run() {
         
            System.out.println("Running Task!");
            for(int i =0; i<=20;i++){
                System.out.println("Thread1 printing"+i);
            }
            System.out.println("Task Completed");
         
    }
    
}
