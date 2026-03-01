// version 2.0
// author Abc
// UseCase 2: Hardcoded Palindrome Check

public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");

        // UC2 Logic: Hardcoded palindrome check
        String word = "madam";
        boolean isPalindrome = true;

        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: \"" + word + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a palindrome ❌");
        }
    }
}
