import java.util.*;

public class commandConsole{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String input = "";

    while(!input.equals("quit")){
        System.out.print("Input: ");
        input = sc.next().toLowerCase();

        switch(input){
            case "hi":
                System.out.println("Hello! How can I help you?");
                break;
      
            case "time":
                System.out.println("Time feature coming soon");
                break;

            case "help":
                System.out.println("Available commands: \nhi\ntime\nclear\nquit");
                break;

            case "clear":
                System.out.println("Screen Cleared");
                break;

            case "quit":
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Unknown Command");
         
        }
    }

    }
}