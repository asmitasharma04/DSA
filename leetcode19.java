// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Solution class
class leetcode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Edge case: If the list has only one node, return null
        if (head.next == null) {
            return null;
        }

        // Calculate the size of the linked list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // Special case: If n equals the size, remove the head node
        if (n == size) {
            return head.next;
        }

        // Find the node just before the node to remove
        int indextosearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indextosearch) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        prev.next = prev.next.next;

        // Return the modified linked list
        return head;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        leetcode19 solution = new leetcode19();
        System.out.println("Original Linked List:");
        solution.printList(head);

        // Remove the 2nd node from the end (n = 2)
        int n = 2;
        ListNode newHead = solution.removeNthFromEnd(head, n);

        // Print the modified linked list
        System.out.println("Linked List after removing the " + n + "th node from the end:");
        solution.printList(newHead);
    }
}
