package interfaces;

public interface Laptop {
    public void copy();  // we call it abstract method
    public void paste();
    public void cut();
    public void keyboard();

//    public void security(); // new method add we get problem before java 7

    default  void security(){
        commonCode();
        System.out.println("Laptop default have virus protector");
    }

    static  void HdVideo(){
        commonCode();
        System.out.println("HD video supports");
    }

    private static void commonCode(){
        System.out.println("Common features");
    }

}
