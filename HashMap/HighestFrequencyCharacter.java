import java.util.HashMap;

public class HighestFrequencyCharacter {
    public static void main(String[] args){
        String str = "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // int max = 0;
        // for(int val : map.values()){
        //     max = Math.max(val, max);
        // }
        // System.out.println(max);
        int max = 0;
        char ans = ' ';
        for(char ch : map.keySet()){
            if(map.get(ch)>max){
                max = map.get(ch);
                ans = ch;
            }
        }
        System.out.println(ans);
    }
}
