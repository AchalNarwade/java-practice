import java.util.*;

public class PrimeNumInRange{
    
    public static void primeRange(int a,int b){
   
    ArrayList<Integer> primes = new ArrayList<>();

    for(int i=a;i<=b;i++){

        if(i<=1){
            continue; //skip the non prime
        }
        boolean isPrime = true;
       
        for(int j=2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            primes.add(i);
        }
    }
    System.out.println("Prime number in range:");
    System.out.println(primes);
    
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    primeRange(num1,num2);

    }
}