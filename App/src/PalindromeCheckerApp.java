
import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Push characters into stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌");
        }

        sc.close();
    }
}
