import java.util.*;

public class PrimaryDiagonalSum{
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
    for(int i=0;i<matrix.length;i++){
        sum += matrix[i][i];
    }
    System.out.println("Sum of primary diagonal: " + sum);
}else{
    System.out.println("Matrix should be square matrix");
}

    }
}