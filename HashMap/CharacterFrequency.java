// import java.util.*;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String args[]){
        String fruit = "banana";
        HashMap<Character,Integer> frequency = new HashMap<>();
        for(int i=0;i<fruit.length();i++){
            char ch = fruit.charAt(i);

            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        System.out.println(frequency);
    }
}