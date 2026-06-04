import java.util.HashMap;

public class TwoStringSameCharacter {
    public static boolean isAnagram(String s,String t){

        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(int val : map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "aab";
        String t = "abb";

        System.out.println(isAnagram(s, t));
    }
}
