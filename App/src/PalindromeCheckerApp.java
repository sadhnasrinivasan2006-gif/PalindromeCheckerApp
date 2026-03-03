import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
       PalindromeStrategy strategy=new StackStrategy();
       boolean isPalindrome=strategy.check(input);
       System.out.print("is it a palindrome?:"+isPalindrome);
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