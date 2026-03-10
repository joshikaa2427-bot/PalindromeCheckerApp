// version 13.0
// author Joshika
// UseCase 13: Performance Comparison of Palindrome Algorithms

import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Simple iterative palindrome check
    public static boolean iterativeCheck(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Stack-based palindrome check
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        String reversed = "";
        while (!stack.isEmpty()) reversed += stack.pop();
        return str.equals(reversed);
    }

    // Deque-based palindrome check
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Recursive palindrome check
    public static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System (Performance Comparison)");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Measure execution times
        long startTime, endTime;

        startTime = System.nanoTime();
        boolean iterativeResult = iterativeCheck(input);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean stackResult = stackCheck(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean dequeResult = dequeCheck(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean recursiveResult = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Display results
        System.out.println("\nPerformance Comparison Results:");
        System.out.println("Iterative: " + iterativeResult + " | Time: " + iterativeTime + " ns");
        System.out.println("Stack:     " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque:     " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Recursive: " + recursiveResult + " | Time: " + recursiveTime + " ns");

        sc.close();
    }
}


