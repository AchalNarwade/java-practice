import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class mortgageCalculator{
    
    //Constants(instead of magic numbers)

    private static final int MONTHS_IN_YEAR = 12;
    private static final int PERCENT = 100;


    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Principal: ");
    int principal = sc.nextInt();
   
    System.out.print("Annual Interest Rate: ");
    double rate = sc.nextDouble();

    System.out.print("Period (Years): ");
    int years = sc.nextInt();

    double monthlyRate = rate/PERCENT/MONTHS_IN_YEAR;
    int numberOfPayments = years*MONTHS_IN_YEAR;
   
    double mortgage = principal * (monthlyRate*Math.pow((1 + monthlyRate), numberOfPayments))/(Math.pow(1+monthlyRate, numberOfPayments)-1);

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = "$" +currency.format(mortgage);

    System.out.print("Mortgage(Monthly EMI): " + result);
    
    }
}