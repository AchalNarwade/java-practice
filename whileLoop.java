import java.util.*;

public class whileLoop{
    public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    String input = "";
    while(!input.equals("quit")){
        System.out.print("Input: ");
        input = sc.next().toLowerCase();
        System.out.println(input);
    }
   
    
    }
}