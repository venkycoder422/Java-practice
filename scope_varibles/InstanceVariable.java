package scope_varibles;
public class InstanceVariable {
    int instanceVariable;
    String name = "Venky";

    public void innerMethod(){
        instanceVariable = 30;
        System.out.println(name);
        System.out.println(instanceVariable);
    }   
}
