import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text:");
        String input = sc.nextLine();
        String rev = "";
        boolean isPalindrome = true;
        for (int i = input.length()-1; i >=0; i--) {
            rev = rev + input.charAt(i);
        }


        if (input.equals(rev)) {
            System.out.println("Is it a palindrome?: true");
        } else {
            System.out.println("Is it a palindrome?: false");
        }


    }

}
