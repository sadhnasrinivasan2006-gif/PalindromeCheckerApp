import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "a man a plan a canal panama";
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.print("is it a palindrome?:"+isPalindrome);

    }
}