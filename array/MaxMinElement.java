/* Time Complexity = O(rows*cols)
   Space Complexity = O(1)
*/

import java.util.*;

public class MaxMinElement{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row number: ");
    int rows = sc.nextInt();
    System.out.print("Enter column number: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];
     
    System.out.println("Enter the elements of matrix: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt(); 
        }
    }
    int max = matrix[0][0];
    int min = matrix[0][0];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(max<matrix[i][j]){
                max = matrix[i][j];
            }
            if(min>matrix[i][j]){
                min = matrix[i][j];
            }
        }
    }
    System.out.println("Maximum element in matrix: " + max);
    System.out.println("Minumum element in matrix: " + min);

    }
}