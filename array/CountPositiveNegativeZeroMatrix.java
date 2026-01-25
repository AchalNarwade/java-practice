import java.util.*;

public class CountPositiveNegativeZeroMatrix{
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
//counting
    int positive = 0;
    int negative = 0;
    int zero = 0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j] > 0){
                positive++;
            }else if(matrix[i][j] < 0){
                negative++;
            }else{
                zero++;
            }
       }
    }
    System.out.println("positive count: " + positive);
    System.out.println("Negative count: " + negative);
    System.out.println("Zero count: " + zero);
    }
}