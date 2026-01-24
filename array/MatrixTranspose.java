import java.util.*;

public class MatrixTranspose{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row number: ");
    int rows = sc.nextInt();
    System.out.print("Enter column number: ");
    int cols = sc.nextInt();

    int[][] transpose = new int[cols][rows];
    int[][] matrix = new int[rows][cols];
     
    System.out.println("Enter the elements of matrix: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt(); 
        }
    }
    System.out.println("Transpose Matrix: ");
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[i].length;j++){
            transpose[i][j] = matrix[j][i];
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
    
    }
}