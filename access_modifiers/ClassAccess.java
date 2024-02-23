package access_modifiers;

public class ClassAccess {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println(classA.marks);
        System.out.println(classA.protectedVar);
        // System.out.println(classA.password); // error private variable should use in same class
    }
}
