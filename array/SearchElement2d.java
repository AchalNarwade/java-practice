import java.util.*;

public class SearchElement2d{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("row:");
    int row = sc.nextInt();
    System.out.print("col:");
    int col = sc.nextInt();

    int nums[][] = new int[row][col];
//input matrix 
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
           nums[i][j] = sc.nextInt(); 
        }
    }
//searching element
    System.out.print("Enter the element to be searched for: ");
    int x = sc.nextInt();

    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            if(nums[i][j] == x){
               System.out.println("number found at: [ "+ i + ", " + j + " ]" );
            }
        }
    }

    }
}