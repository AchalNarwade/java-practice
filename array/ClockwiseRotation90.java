import java.util.*;

public class ClockwiseRotation90{
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

//Rotation logic (i.e taking transpose and then reversing row)
    System.out.println("Mtarix with Clockwise rotation 90 deg : ");
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[i].length;j++){
            transpose[i][j] = matrix[j][i];
        }   
    }
    int n = transpose.length;
   for(int i=0;i<transpose.length;i++){
        int left=0;
        int right = transpose[i].length-1;
        while(left<=right){
            int c = transpose[i][left];
            transpose[i][left] = transpose[i][right];
            transpose[i][right] = c;
            left++;
            right--;
        }
    }
//resultant matrix
    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[i].length;j++){
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();   
    }



    }
}