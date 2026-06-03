import java.util.HashMap;

public class FirstRepeatingCharacter {
    public static void main(String[] args){

        HashMap<Character,Integer>map = new HashMap<>();
        String str = "programming";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                System.out.println(ch);
                break;
            }else{
                map.put(ch,1);
            }
        }
    }
}
