import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
       PalindromeStrategy strategy=new StackStrategy();
       long starttime=System.nanoTime();
       boolean isPalindrome=strategy.check(input);
       long endtime=System.nanoTime();
       long executiontime=endtime-starttime;
       System.out.println("input:"+input);
       System.out.println("is it a palindrome?:"+isPalindrome);
       System.out.println("execution time:"+executiontime+"ns");
    }

}
interface PalindromeStrategy{
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy{
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;

    }

}