import java.util.*;

public class WordFrequency {
    public static void main(String[] args){
        String sentence = "I love java and I love coding";

        HashMap<String,Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}
