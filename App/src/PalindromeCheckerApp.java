import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for (char c: input.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        boolean isPalindrome = true;
        while(!queue.isEmpty()){
            if(!stack.pop().equals(queue.remove())){
                isPalindrome=false;
                break;
            }

        }

        System.out.println("Is it a palindrome?: " + isPalindrome);

    }
}