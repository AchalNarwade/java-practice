import java.util.*;

public class StudentMarks {
        public static void main(String[] args){
            HashMap<String , Integer> studentMark = new HashMap<>();

            studentMark.put("rahul", 90);
            studentMark.put("aman",85);
            studentMark.put("neha",95);

            //printing hashmap
            System.out.println(studentMark);

            //rahul's mark
            System.out.println("Rahul Marks:" + studentMark.get("rahul"));

            studentMark.put("aman",88);

            studentMark.remove("neha");

            System.out.println(studentMark);
    }
}
