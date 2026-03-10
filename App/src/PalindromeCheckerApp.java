
import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call: move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Call recursive function
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Print result
        if (result) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌");
        }

        sc.close();
    }
}
