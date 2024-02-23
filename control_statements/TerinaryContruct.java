package control_statements;

import java.util.Scanner;

public class TerinaryContruct {
    public static void main(String argsp[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you Name:");
        String name = scanner.nextLine();
        System.out.println("Enter you Age:");
        int age  = scanner.nextInt();
        // System.out.println(name);
        // System.out.println(age);
        
        if(age<18){
            System.out.println(name+" Your a child");
        }else{
            System.out.println(name+" Your a Major");
        }

       String response = (age>18)?"Your a Major":"Your a child";
       System.out.println(response);
    }

}
