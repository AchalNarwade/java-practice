import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

// Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

// Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

// Matrix addition
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
// Print result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
