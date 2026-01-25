import java.util.*;


public class IsSymmetrix{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter row: ");
    int rows = sc.nextInt();
    System.out.print("Enter Cols: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];
    int[][] transpose = new int[cols][rows];

    System.out.println("Enter the elements: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    
    if(rows!=cols){
        System.out.println("Matrix is not symmetric");
        return;
    }
    
    boolean isSymmetric = true;

      for(int i=0;i<rows;i++){
        for(int j=i+1;j<cols;j++){
            if(matrix[i][j] != matrix[j][i]){
                isSymmetric = false;
                break;
            }
        }
    }
    
    if(isSymmetric){
        System.out.println("Matrix is Symmetric");
    } else{
        System.out.println("Matrix is not Symmetric");
    }

         

    }
}