package MultiThreads;

public class Threads {
    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName()); // name of CurrentThread
        // System.out.println(Thread.activeCount()); // Gets a no of active threads means which are running currently
        // System.out.println(Thread.currentThread().getPriority()); //1-10 priority
        // System.out.println(Thread.currentThread().getId()); // Random number

        // Thread t1 = new Thread(); 
        // Thread t2 = new Thread();
        // Thread t3 = new Thread();
        // t1.start();

        // t2.start();

        // t3.start();

        Employee emp = new Employee();
        Thread t1 = new Thread(emp);
        t1.start();
        Manager manager = new Manager();
        manager.start();
        System.out.println(Thread.activeCount()); // give 2 active counts why beacouse it Java kill the after excecution completes
        // The active count will get executes first due to asyynchonous excecution


    }

    
}

class Employee implements Runnable{
        
        @Override
        public void run(){
            System.out.println("HELLO");
        }
}

class Manager extends Thread{
        
        @Override
        public void run(){
            System.out.println("Hai Manager");
        }
}
