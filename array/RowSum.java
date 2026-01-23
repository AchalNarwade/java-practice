import java.util.*;

public class RowSum{
    public static void main(String[] args){

    int[][] nums = {{1,2,3},{2,3,4}};
    int highest = 0;
    for(int i=0;i<nums.length;i++){
        int rowSum = 0;
        for(int j=0;j<nums[i].length;j++){
            rowSum += nums[i][j];
            highest = Math.max(highest,rowSum);
        }
        System.out.println("Row sum for i= "+ i + " , RowSum= " + rowSum);
    }
    System.out.println("The highest sum: " + highest);

    }
}