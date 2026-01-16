import java.util.Scanner;
import java.util.Arrays;

public class DescendingSorting{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();
    int[] numbers = new int[size];

    //input
    for(int i=0;i<size;i++){
        numbers[i] = sc.nextInt();
    }
    System.out.println("Before Sorting: "+ Arrays.toString(numbers));

    //sorting logic
    for(int i=0;i<numbers.length;i++){
        for(int j=i+1;j<numbers.length;j++){
            if(numbers[i]<numbers[j]){
                int c = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = c;
            }
        }
    }

    System.out.println("After Sorting: "+ Arrays.toString(numbers));

    }
}