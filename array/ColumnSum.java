import java.util.Scanner;

public class  ColumnSum{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
//column-wise Sum:
    int highest = 0;
    for(int i=0;i<cols;i++){
        int ColumnSum = 0;
        for(int j=0;j<rows;j++){
         ColumnSum += matrix[j][i];
        }
        highest = Math.max(highest,ColumnSum);
        System.out.println("Sum of " + i + " column is: " + ColumnSum);
    }
    System.out.println("The highest sum of column: " + highest);
    sc.close();

    }
}