import java.util.*;

public class CountEvenOdd{
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
    int even = 0;
    int odd = 0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j] % 2 == 0){
               even++;
            }else{
                odd++;
            }
       }
    }
    System.out.println("Even count: " + even);
    System.out.println("Odd count: " + odd);



    }
}