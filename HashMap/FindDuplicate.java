import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,2};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println("Contains duplicate");
                break;
            }else{
                map.put(arr[i],1);
            }
        }
    }
}
