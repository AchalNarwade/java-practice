import java.util.*;

public class ternaryOperator{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Today's Temperature: ");
    int temp = sc.nextInt();

    String result =
        (temp>30) ? "it's a hot day!\nDrink plenty of water"
       :(temp>=20 && temp<=30) ? "It's a nice day!"
       : "It's a cold day!";

    System.out.println(result);



    }
}