package inheritence;

class Base{

    int i;
    int j;

    Base(int i, int j){ // Parameterised constructor
        this.i=i;
        this.j=j;
    }

    Base(){}; // default constructor

    void display(){
        System.out.println("Display  BASE Class : "+i+" and "+j);
    }
}


class Derived extends Base {

    int k;
    Derived(int k){
        // super();  // invoke default constructor
        super(20,40); // invoke parameterised constructor
        this.k = k;
    }

     void display(){
        super.display();
        System.out.println("Display  Derieved Class : "+k);
    } 
}

public class ConstructInheritence {
    public static void main(String[] args) {
        Base base = new Base();
        base.i = 100;
        base.j = 200;
        base.display();
        Derived derived = new Derived(300);
        derived.display();
    }
}
