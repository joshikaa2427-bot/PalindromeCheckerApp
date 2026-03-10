
import java.util.Scanner;

class PalindromeChecker {
    // Encapsulated method to check palindrome
    public boolean checkPalindrome(String str) {
        // Normalize input (optional: ignore case & spaces)
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Use the PalindromeChecker service class
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        // Print result
        if (result) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌");
        }

        sc.close();
    }
}

