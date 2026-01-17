import java.util.*;

public class TwoSum{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int nums[] = new int[size];
    int arr[] = new int[2];

    //input
    for(int i=0;i<size;i++){
        nums[i] = sc.nextInt();
    }
    System.out.println("Array: " + Arrays.toString(nums));


    //logic
    int target = sc.nextInt();
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0] = i;
                arr[1] = j;
                break;
            }
        }

    }
    System.out.println("The indices are " + Arrays.toString(arr));
    }
}