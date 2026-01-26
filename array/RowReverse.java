/* Time Complexity: O(rows × columns)
   Space Complexity: O(1) (in-place)
*/

import java.util.*;

public class RowReverse{
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
//Logic for Row Reverse
    for(int i=0;i<matrix.length;i++){
        int left=0;
        int right = matrix[i].length-1;
        while(left<=right){
            int c = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = c;
            left++;
            right--;
        }
    }
    System.out.println("Matrix with Reversed row: ");
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
             System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
   
    sc.close();

    }
}