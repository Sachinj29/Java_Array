import java.util.Scanner;

public class ArrayJaggad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Declare a jagged array with 'rows' number of rows
        int[][] jaggedArray = new int[rows][];

        // Loop to define the number of columns for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            // Input elements for each row
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Display the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
