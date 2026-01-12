import java.util.*;

public class PrimeNum{

    public static void Prime(int n){
        
    boolean isPrime = true;
    if(n<=1){
        isPrime = false;
    }
    else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
    }
    if(isPrime){
        System.out.println("The number entered is Prime number: " + n);
    }else{
        System.out.println("The number enetered is not prime number: "+ n);
    }
    
    }

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
  
    Prime(num);

    }

}