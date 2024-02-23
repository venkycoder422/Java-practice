package java_loops;

public class WhileLoop {
    public static void main(String args[]) {
        int i=0;
        int salaries[] = {20000,800000,30000};

        while(i<salaries.length ){
            if(salaries[i]>70000){
                System.out.println("The tax should pay");
            }
            i++;
        }
    }

}
