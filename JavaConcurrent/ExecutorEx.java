package JavaConcurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
// import java.util.concurrent.ThreadPoolExecutor;


public class ExecutorEx {
  
    public static void main(String[] args) {

        Executor executor = Executors.newCachedThreadPool();
        Executor executor2 = new Invoker();
        executor2.execute(new Thread1());
        executor.execute(new Thread2());
        // executor.execute(new Thread1());
        // ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;
        // pool.shutdown();


    }
}
