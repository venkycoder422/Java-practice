package control_statements;

import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- TIME TABLE -----");
        System.out.println("ENTER DAY:");
        String day = scanner.nextLine();
        switch(day){
            case "Monday":
                System.out.println("Holiday and Learning Java.");
                break;
            case "Tuesday":
                System.out.println("Holiday and Learning Java and Watching Movie.");
                break;
            case "Wednesday":
                System.out.println("Working Day and Doing Spashtam application.");
                break;
            case "Thurday":
                System.out.println("Working Day and Doing Spashtam application.");
                break;
            case "Friday":
                System.out.println("Working Day and Doing Spashtam application.");
                break;
            case "Saturday":
                System.out.println("Working Day and Doing Spashtam application.");
                break;
            default:
                System.out.println("Working Day and Doing Spashtam application.");

        }
    }
}
