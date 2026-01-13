import java.util.*;

public class GreatestCommonDivisior{
    public static int GreatestDivisor(int a, int b){

    int max, min, rem;

    if(a>b){
       max = a;
       min = b;
    }else{
        max = b;
        min = a;
    }
    while(min!=0){
        rem = max % min;
        max = min;
        min= rem;
        
    }
    return max;
    }



    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two number: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.print("The GCD is: "+ GreatestDivisor(num1,num2));

    }
}