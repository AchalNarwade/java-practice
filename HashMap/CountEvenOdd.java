import java.util.HashMap;
public class CountEvenOdd {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,8};
        HashMap<String,Integer> map = new HashMap<>();
        map.put("even",0);
        map.put("odd",0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                // int count = map.get("even");
                // count= count +1;
                // map.put("even", count);
                map.put("even", map.getOrDefault("even",0)+1);
                
            }else{
                // int count = map.get("odd");
                // count = count +1;
                // map.put("odd",count);
                map.put("odd", map.getOrDefault("odd",0)+1);
            }
        }
        System.out.println(map);


    }
}
