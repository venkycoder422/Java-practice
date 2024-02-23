package arrays_dim;

public class ArrayMultiDim {
    public static void main(String args[]) {
        // int[][] myArray = new int[3][4];

        // for (int i = 0; i < myArray.length; i++) {
        //     for (int j = 0; j < myArray[i].length; j++) {
        //         myArray[i][j] = 0;
        //     }
        // }

        // System.out.println(Arrays.toString(myArray));
        int[][] myArray = new int[3][4];

        // Initialize the elements of the array
        for (int i = 0; i < myArray.length; i++) {
          for (int j = 0; j < myArray[i].length; j++) {
            myArray[i][j] = i + j + 1;
          }
        }
    
        // Print out the elements of the array
        for (int i = 0; i < myArray.length; i++) {
          for (int j = 0; j < myArray[i].length; j++) {
            System.out.print(myArray[i][j]);
          }
        }
    }
}
