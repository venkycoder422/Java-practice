package access_modifier2;

import access_modifiers.ClassA;

class Derrieved extends ClassA{
    public void displayProtected(){
        System.out.println(protectedVar); // I can Access Protected Variables out side package but in subclass(Derieved class)
    }
}

public class AccessModA {
     
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.show(); // Public can access from anywhere package, in - out class
        // System.out.println(classA.protectedVar); // outside package is not work
    }
}
