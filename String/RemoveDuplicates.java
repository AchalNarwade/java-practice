public class RemoveDuplicates{
    public static void main(String[] args){

    String input =  "programming";
    String result = "";

    for(int i=0;i<input.length();i++){
        boolean isEqual = false;
        for(int j=0;j<i;j++){
            if(input.charAt(i) == input.charAt(j)){
                isEqual = true;
                break; 
            }
        }
        if(!isEqual){
            result += input.charAt(i);
        }
         
     }
     System.out.println("Result: " + result);

    }
}