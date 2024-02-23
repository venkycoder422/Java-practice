package java_packages;

// import java.util.*; //Import all classes from util package;
import java.util.Scanner; // Import the only Scanner class

public class Main {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your name :"+name);
    }
}
