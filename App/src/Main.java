
import java.util.Scanner;
public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String original = sc.nextLine();

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String concatenation
        }

        if (original.equals(reversed)) {
            System.out.println("Result: \"" + original + "\" is a palindrome ");
        } else {
            System.out.println("Result: \"" + original  + "\" is NOT a palindrome ");
        }

        sc.close();
    }
}

