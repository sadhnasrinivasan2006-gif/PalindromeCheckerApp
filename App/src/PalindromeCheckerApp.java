import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(c);
        }
        boolean isPalindrome = true;
        while (deque.size()>1) {
            char first=deque.pollFirst();
            char last =deque.pollLast();
            if(first!=last){
                isPalindrome=false;
                break;
            }
        }
        System.out.println("is it a palindrome?:"+isPalindrome);
    }
}