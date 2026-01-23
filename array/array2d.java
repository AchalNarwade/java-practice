import java.util.*;

public class array2d{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Col: ");
    int col = sc.nextInt();
    System.out.print("row: ");
    int row = sc.nextInt();

    int[][] arr = new int[row][col];

//input
    for(int i =0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j] = sc.nextInt();
        }
    }

//output
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }

//Sum of all elements
    int sum =0;

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            sum +=arr[i][j];
        }

    }

    System.out.println("Sum: "+ sum);







    }
}