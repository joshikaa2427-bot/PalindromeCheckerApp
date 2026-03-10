
import java.util.*;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // UC7 Logic: Insert characters into deque
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));  // insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear until empty
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌");
        }

        sc.close();
    }
}
