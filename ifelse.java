import java.util.*;

public class ifelse{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Today's Temperature: ");
    int temp = sc.nextInt();

    if(temp>30){
        System.out.println("It's hot day!");
        System.out.println("Drink plenty of water");
    }
    else if(temp>=20 && temp<=30){
        System.out.println("It's nice day!");
    }
    else{
        System.out.println("it's Cold day!");
    }

    }
}