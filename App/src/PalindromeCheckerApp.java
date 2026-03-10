// version 10.0
// author Joshika
// UseCase 10: Case-Insensitive & Space-Ignored Palindrome Checker

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Function to normalize string (remove spaces, ignore case)
    public static String normalize(String str) {
        // Remove all spaces using regex and convert to lowercase
        return str.replaceAll("\\s+", "").toLowerCase();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
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

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Normalize input
        String normalized = normalize(input);

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅ (case-insensitive & spaces ignored)");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌ (case-insensitive & spaces ignored)");
        }

        sc.close();
    }
}
