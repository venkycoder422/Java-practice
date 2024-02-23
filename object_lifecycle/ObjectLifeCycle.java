package object_lifecycle;

public class ObjectLifeCycle {
    public static void main(String args[]){
        LifeCycle lifeCycle = new LifeCycle();
        LifeCycle lifeCycle2 = new LifeCycle();
        lifeCycle = lifeCycle2;
        lifeCycle2 = null; // lifeCycle2 id derefered and it is now garbageCollection;
        System.out.println(lifeCycle);
        System.out.println(lifeCycle2);

    }
}

class LifeCycle{
    String creation;
    String derefernceByReassignment;
    String garbageCollection;
}
