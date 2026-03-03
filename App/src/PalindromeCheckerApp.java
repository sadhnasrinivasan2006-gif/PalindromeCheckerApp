import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
       PalindromeService service=new PalindromeService();
       boolean isPalindrome=service.checkPalindrome(input);
       System.out.print("is it a palindrome?:"+isPalindrome);
    }

}
class PalindromeService{
    public boolean checkPalindrome(String input){
        int start=0;
        int end=input.length()-1;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}