import java.util.*;

public class SecondaryDiagonalSum{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row number: ");
    int rows = sc.nextInt();
    System.out.print("Enter column number: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];
     
if(rows == cols){
    System.out.println("Enter the elements of matrix: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt(); 
        }
    }
 
    int sum = 0;
    int n = matrix.length;
    for(int i=0;i<n;i++){
        sum += matrix[i][n-1-i];
    }
    System.out.println("Sum of secondary diagonal: " + sum);
}else{
    System.out.println("Matrix should be square matrix");
}

    }
}