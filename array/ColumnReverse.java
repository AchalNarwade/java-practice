/* Time Complexity: O(rows × columns)
   Space Complexity: O(1) (in-place)
*/

import java.util.*;

public class ColumnReverse{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    
 // Input dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

// Input matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
//Logic for Column Reverse
    for(int i=0;i<matrix[0].length;i++){
        int top=0;
        int bottom = matrix.length-1;
        while(top<=bottom){
            int c = matrix[top][i];
            matrix[top][i] = matrix[bottom][i];
            matrix[bottom][i] = c;
            top++;
            bottom--;
        }
    }
    System.out.println("Matrix with Reversed Column: ");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
             System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
   
    sc.close();

    }
}