public class Leetcode234 {

    // Function to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Function to find the middle of the linked list
    public ListNode findmiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    // Function to check if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle of the list
        ListNode middle = findmiddle(head);

        // Step 2: Reverse the second half of the list
        ListNode secondhalfstart = reverse(middle.next);

        // Step 3: Compare both halves
        ListNode firsthalfstart = head;
        while (secondhalfstart != null) {
            if (firsthalfstart.val != secondhalfstart.val) {
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }

        return true;
    }

    // Main method (psvm) to test the code
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 2 -> 1
        Leetcode234 solution = new Leetcode234();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        // Check if the linked list is a palindrome
        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

