/* Time Complexity: O(row1 × col2 × col1)
For square matrix N × N → O(N³)
Space Complexity: O(row1 × col2) (result matrix)
*/

import java.util.*;

public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter number of row1: ");
        int row1 = sc.nextInt();

        System.out.print("Enter number of columns1: ");
        int col1 = sc.nextInt();
 
        System.out.print("Enter number of row2: ");
        int row2 = sc.nextInt();

        System.out.print("Enter number of columns2: ");
        int col2 = sc.nextInt();
   
        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] result = new int[row1][col2];

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
     
//Matrix Multiplication
    for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
            for(int k=0;k<col1;k++)
                result[i][j] += arr1[i][k] * arr2[k][j];
        }
    }
    for(int i=0;i<result.length;i++){
        for(int j=0;j<result[i].length;j++){
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }

    }
}