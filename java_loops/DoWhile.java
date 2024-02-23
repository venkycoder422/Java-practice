package java_loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int limit=1;
        do{
            System.out.print(limit+" ");
            limit++;
        }while(n>=limit);

    }
}
