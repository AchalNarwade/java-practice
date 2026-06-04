import java.util.HashSet;

public class CommonElementsBetween2Array {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,3,4,4};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
        
    }
}
