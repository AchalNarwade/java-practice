import java.util.*;

public class stringBuilder{
    public static void main(String[] args){

    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    //chat at index 0
    System.out.println(sb.charAt(0));

    //set char at index 0
    sb.setCharAt(0,'p');
    System.out.println(sb);

    //insert the char
    sb.insert(0,'S');
    System.out.println(sb);

    //delete
    sb.delete(2,4);
    System.out.println(sb);

    //append
    StringBuilder sb1 = new StringBuilder("Hello");
    sb1.append(" World");
    System.out.println(sb1);
    }
}