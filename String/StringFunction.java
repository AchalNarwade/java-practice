public class StringFunction{
    public static void main(String[] args){

    String str = "Java Programming";

    //length()
    System.out.println("Length os String: " + str.length());

    //CharAt()
    System.out.println("Character at 3: " + str.charAt(3));

    //Substring()
    System.out.println("Substring: " + str.substring(5));

    //toUpperCase()
    System.out.println("To UpperCase: " + str.toUpperCase());

    //toLowerCase()
    System.out.println("To Lowercase: " + str.toLowerCase());

    //equals()
    System.out.println("Equals: " + str.equals("Java Programming"));

    //contains()
    System.out.println("Contains: " + str.contains("Java"));

    //replace()
    System.out.println("Repalce: " + str.replace("Java" ,"Python"));

    //indexOf()
    System.out.println("Index of P: " + str.indexOf("P"));

    }
}