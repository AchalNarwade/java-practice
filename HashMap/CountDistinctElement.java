import java.util.HashSet;

public class CountDistinctElement {
    public static int isDistinct(int[] arr){

        HashSet<Integer>set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args){
         int[] arr = {1, 2, 2, 3, 4, 4, 5};
         System.out.println(isDistinct(arr));
    }
}
