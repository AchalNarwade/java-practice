//Switches with ranges
import java.util.*;

public class switchStatement{
     public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter you marks: ");
     int marks = sc.nextInt();

     switch(marks/10){
         case 10:
         case 9:
             System.out.println("Grade A");
             break;

         case 8:
         case 7:
             System.out.println("Grade B");
             break;
         
         case 6:
             System.out.println("Grade C");
             break;

         default:
             System.out.println("Fail");

     }

     }
}