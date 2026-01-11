import java.util.*;

public class factorial{
    public static long calculateFactorial(int n){ 
    if(n==1 || n==0){
        return 1;
    }else{
        return n * calculateFactorial(n-1);
    }
    
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    if(num<0){
        System.out.println("Invalid Input");
    }else{
        System.out.println("Factorial: " + calculateFactorial(num));
    }

    }
}

//instead of int in the function, used long to stop the overflow of numbers for larger integer.