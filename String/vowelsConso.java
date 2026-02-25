import java.util.Scanner;

public class vowelsConso{
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String str = input.toLowerCase();

    String vowel = "aeiou";
    int vowelCount =0;
    int consoCount = 0;

    for(int i=0;i<str.length();i++){
        boolean isVowel = false;
        for(int j=0;j<vowel.length();j++){
            if(str.charAt(i) == vowel.charAt(j)){
                isVowel = true;
                vowelCount++;
                break;
            }
        }
        if(!isVowel){
            consoCount++;
        }
    }
    System.out.println("total vowels: " + vowelCount);
    System.out.println("total consonants: " + consoCount);
    }
}