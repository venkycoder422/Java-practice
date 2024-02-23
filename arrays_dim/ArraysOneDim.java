package arrays_dim;

import java.util.Arrays;

public class ArraysOneDim {
    public static void main(String args[]) {
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 1;
        anArray[1] = 2;
        anArray[2] = 3;
        System.out.println(anArray[0]);
        int[] myArray = new int[] { 1, 2, 3, 4, 5 };
        int[] myArray2 = {10, 20, 30};

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);

        for(int i = 0; i<myArray2.length; i++){
            System.out.print(myArray2[i]+" ");
        }

        System.out.println(Arrays.toString(myArray));
    }
}
