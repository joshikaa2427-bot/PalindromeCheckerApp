
import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // Function to check palindrome using linked list
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using fast & slow pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Convert string to linked list
        Node head = null;
        Node tail = null;
        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println("Result: \"" + input + "\" is a palindrome ✅");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome ❌");
        }

        sc.close();
    }
}
