public class palindrome{
    public static void main(String[] args){

    String str = "madam";
    int left = 0;
    int right = str.length()-1;
    boolean isPalindrome=true;

    while(left<right){
        if(str.charAt(left) == str.charAt(right)){
            left++;
            right--;
        }else{
            isPalindrome = false;
            break;
        }
    }
    if(isPalindrome){
        System.out.println("Yes,palindrome");
    }else{
        System.out.println("No,palindrome");
    }

    }
}