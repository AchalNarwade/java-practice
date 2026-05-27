import java.util.*;

public class NumberFrequency {
    public static void main(String args[]){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int[] arr = {1,2,1,3,2,1,4};
        for(int i=0;i<arr.length;i++){
            // int index = arr[i];
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        System.out.println(frequency);
    }
}
