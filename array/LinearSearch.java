import java.util.*;

public class LinearSearch{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] numbers = new int[size];
    //input
    for(int i=0;i<size;i++){
        numbers[i] = sc.nextInt();
    }
    System.out.print("Which number you want to search: ");
    int num = sc.nextInt();

    boolean found = false;

    for(int i=0;i<size;i++){
        if(num==numbers[i]){
            System.out.println("Number found at: " + i+ " index" );
            found = true;
            break;
        }
    }
    
    if(!found){
        System.out.println("Number not present in the array");
    }

    }
}