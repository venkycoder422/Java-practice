package java_loops;

public class ForLoop {
    public static void main(String args[]) {

        int evenNumTot = 0;
        // Sum first 50 the even numbers;

        for (int i = 0; i <= 50; i = i + 2) {
            evenNumTot += i;
        }

        System.out.println("Sum of first 50 even numbers: " + evenNumTot);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Enchanced for loop
        int[] array = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 5, 5, 5 };

        for (int element : array) {
            System.out.println(element);
        }
    }

}
