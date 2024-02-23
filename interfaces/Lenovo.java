package interfaces;

public class Lenovo implements  Laptop{

    @Override // Override is not a mandatory
    public void copy() {
        System.out.println("Lenovo : Ctl+C");
    }

    public void paste() {
        System.out.println("Lenovo : Ctl+V");
    }

    public void cut() {
        System.out.println("Lenovo : Ctl+X");
    }

    public void keyboard() {
        System.out.println("Lenovo : KeyBoard");
    }
}
