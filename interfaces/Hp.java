package interfaces;

public class Hp implements  Laptop{

    @Override // it is not mandatory
    public void copy() {
        System.out.println("Hp: Ctl+C");
    }

    public void paste() {
        System.out.println("Hp: Ctl+V");
    }

    public void cut() {
        System.out.println("Hp: Ctl+X");
    }

    public void keyboard() {
        System.out.println("Hp: Keyboard");
    }

    public  void camera(){ // we can have our own methods in class but interface method should be in implimented class'
        System.out.println("Hp: camera");
    }
    @Override // override is used to know it has overided from interface. but not mandatory user purpose only.
    public void security(){
        System.out.println("Hp have anothor security virus.");
    }


}
