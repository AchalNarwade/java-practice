import java.util.*;

public class CountPositiveNegativeZero{
    public static void main(String[] args){
     
    int positive = 0, negative = 0, zero = 0;
    System.out.println("Press 1 to continue & 0 to Stop");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    while(input == 1){
        System.out.print("Enter your number: ");
        int number = sc.nextInt();
        if(number>0){
            positive++;
        }else if(number<0){
            negative++;
        }else{
            zero++;
        }
        System.out.println("Press 1 to continue & 0 to Stop");
        input = sc.nextInt();
    }
    
    System.out.println("Positives: " + positive);
    System.out.println("Negatives: " + negative);
    System.out.println("Zeroes: " + zero);



    }
}