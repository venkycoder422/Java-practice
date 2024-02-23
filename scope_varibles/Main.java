package scope_varibles;

public class Main {
    public static void main(String[] args){
      // Local Variables
        System.out.println("HELLO");
        // Creating an instance of the Main class
        Main instanceMain = new Main();
        // Calling the someMethod on the instance
        instanceMain.someMethod();

      // Instance variables
        Scopecheck obj = new Scopecheck();
        obj.instance = 50;  //50
        obj.inst();
        Scopecheck obj2 = new Scopecheck();
        obj2.inst(); //20

        // Static Variable

        StaticScopecheck obj3 = new StaticScopecheck();
        StaticScopecheck.stat = 60;
        obj3.stat();
        StaticScopecheck obj4 = new StaticScopecheck();
        obj4.stat();

        
    }
    public void someMethod() {
            int localVar = 10; // localVar is a local variable
            // localVar is accessible only within this method
            System.out.println(localVar);
        }
}

class Scopecheck{
  int instance = 20;
  public void inst(){
    int local = 10;
    System.out.println( "'local' can be accessed only inside this function");    
    System.out.println( "Scope of local: " + local);
    System.out.println( "'instance' can be accessed throught the class with normal functions");    
    System.out.println( "Scope of instance: " + instance);
  }
}

class StaticScopecheck{
  static int stat = 20;
  public void stat(){
    int local = 10;
    System.out.println( "'local' can be accessed only inside this function");    
    System.out.println( "Scope of local: " + local);
    System.out.println( "'static' can be accessed throught the class and other classes");    
    System.out.println( "Scope of static: " + stat);
  }
}


