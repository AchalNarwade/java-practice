import java.util.*;

public class MaxMinNum{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    int size = sc.nextInt();
    //input
    int [] numbers = new int[size];
    for(int i=0;i<size;i++){
        numbers[i] = sc.nextInt();
    }

    //for max min
    int max = numbers[0];
    int min = numbers[0];
    for(int i=0;i<size;i++){
        if(numbers[i]>max){
            max = numbers[i];
        }
        
        if(numbers[i]<min){
            min = numbers[i];
        }
    }
    
    System.out.println("Maximum number is: " + max);
    System.out.println("Minimum number is: " + min);


    }
}